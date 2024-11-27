package com.limo.waste.database.redis;

import com.limo.waste.common.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Author limo
 *
 * @Description
 */
@Component
@Slf4j
public class RedisUtil {
    @Resource
    RedisTemplate<String,Object> redisTemplateDb0;
    @Resource
    RedisTemplate<String,Object> redisTemplateDb1;

    public RedisTemplate<String,Object> getRedisTemplate(Integer dbIndex){
        if (dbIndex==1){
            return redisTemplateDb1;
        }else {
            return redisTemplateDb0;
        }
    }
    /**
     * 存值
     *
     * @param key   键
     * @param value 值
     * @return true 成功 false 失败
     */
    public Result<Boolean> lPush(Integer dbIndex, String key, Object value) {
        try {
            getRedisTemplate(dbIndex).opsForList().leftPush(key, value);
            return Result.success();
        } catch (Exception e) {
            log.error("lPush异常：{}，key={}，value={}", e.getMessage(), key, value);
            return Result.fail(Result.FAIL_CODE, e.getMessage());
        }
    }

    /**
     * 取值 - <rpop：非阻塞式>
     *
     * @param key 键
     * @return Object
     */
    public Object rpop(Integer dbIndex, String key) {
        try {
            return getRedisTemplate(dbIndex).opsForList().rightPop(key);
        } catch (Exception ex) {
            log.error("rpop异常：{}，key={}", ex.getMessage(), key);
            return null;
        }
    }

    /**
     * 取值 - <brpop：阻塞式> - 推荐使用
     *
     * @param key      键
     * @param timeout  超时时间
     * @param timeUnit 给定单元粒度的时间段
     *                 TimeUnit.DAYS          //天
     *                 TimeUnit.HOURS         //小时
     *                 TimeUnit.MINUTES       //分钟
     *                 TimeUnit.SECONDS       //秒
     *                 TimeUnit.MILLISECONDS  //毫秒
     * @return Object
     */
    public Object brpop(Integer dbIndex, String key, long timeout, TimeUnit timeUnit) {
        try {
            return getRedisTemplate(dbIndex).opsForList().rightPop(key, timeout, timeUnit);
        } catch (Exception ex) {
            log.error("brpop：{}，key={}", ex.getMessage(), key);
            return null;
        }
    }

    /**
     * 取值 - <brpop：阻塞式>
     *
     * @param key 键
     * @return Object
     */
    public Object brpop(Integer dbIndex, String key) {
        try {
            return getRedisTemplate(dbIndex).opsForList().rightPop(key, 30, TimeUnit.SECONDS);
        } catch (Exception ex) {
            log.error("brpop异常：{}，key={}", ex.getMessage(), key);
            return null;
        }
    }

    /**
     * 查看值
     *
     * @param key   键
     * @param start 开始
     * @param end   结束 0 到 -1代表所有值
     * @return List<Object>
     */
    public List<Object> lrange(Integer dbIndex, String key, long start, long end) {
        try {
            return getRedisTemplate(dbIndex).opsForList().range(key, start, end);
        } catch (Exception ex) {
            log.error("lrange：{}，key={}", ex.getMessage(), key);
            return null;
        }
    }

    /**
     * 设置有效时间
     *
     * @param key     Redis键
     * @param timeout 超时时间
     * @return true=设置成功；false=设置失败
     */
    public Result<Boolean> expire(Integer dbIndex, final String key, final long timeout) {
        try {
            return expire(dbIndex, key, timeout, TimeUnit.SECONDS);
        } catch (Exception ex) {
            return Result.fail(Result.FAIL_CODE, ex.getMessage());
        }

    }

    /**
     * 设置有效时间
     *
     * @param key     Redis键
     * @param timeout 超时时间
     * @param unit    时间单位
     * @return true=设置成功；false=设置失败
     */
    public Result<Boolean> expire(Integer dbIndex, final String key, final long timeout, final TimeUnit unit) {
        try {
            Boolean ret = getRedisTemplate(dbIndex).expire(key, timeout, unit);
            return (ret != null && ret) ? Result.success() : Result.fail();
        } catch (Exception ex) {
            return Result.fail(Result.FAIL_CODE, ex.getMessage());
        }

    }

    /**
     * 删除单个key
     *
     * @param key 键
     * @return true=删除成功；false=删除失败
     */
    public Result<Boolean> del(Integer dbIndex, final String key) {
        try {
            Boolean ret = getRedisTemplate(dbIndex).delete(key);
            return (ret != null && ret)?Result.success():Result.fail();
        } catch (Exception ex) {
            log.error("del异常：{}，key={}", ex.getMessage(), key);
            return Result.fail(Result.FAIL_CODE,ex.getMessage());
        }
    }

    /**
     * 删除多个key
     *
     * @param keys 键集合
     * @return 成功删除的个数
     */
    public long del(Integer dbIndex, final Collection<String> keys) {
        try {
            Long ret = getRedisTemplate(dbIndex).delete(keys);
            return ret == null ? 0 : ret;
        } catch (Exception ex) {
            log.error("del异常：{}，keys={}", ex.getMessage(), keys);
        }
        return 0;
    }

    /**
     * 存入普通对象
     *
     * @param key   Redis键
     * @param value 值
     */
    public void set(Integer dbIndex, final String key, final Object value) {
        try {
            getRedisTemplate(dbIndex).opsForValue().set(key, value);
            log.info("redis-set:key【{}】", key);
        } catch (Exception ex) {
            log.error("set异常：{}，key={}，value={}", ex.getMessage(), key, value);
        }
    }

    // 存储普通对象操作

    /**
     * 存入普通对象
     *
     * @param key     键
     * @param value   值
     * @param timeout 有效期，单位秒
     */
    public void set(Integer dbIndex, final String key, final Object value, final long timeout) {
        try {
            getRedisTemplate(dbIndex).opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
        } catch (Exception ex) {
            log.error("set异常：{}，key={}，value={}", ex.getMessage(), key, value);
        }
    }

    /**
     * 获取普通对象
     *
     * @param key 键
     * @return 对象
     */
    public Object get(Integer dbIndex, final String key) {
        try {
            return getRedisTemplate(dbIndex).opsForValue().get(key);
        } catch (Exception ex) {
            log.error("get异常：{}，key={}", ex.getMessage(), key);
        }
        return null;
    }

    // 存储Hash操作

    /**
     * 往Hash中存入数据
     *
     * @param key   Redis键
     * @param hKey  Hash键
     * @param value 值
     */
    public void hPut(Integer dbIndex, final String key, final String hKey, final Object value) {
        try {
            getRedisTemplate(dbIndex).opsForHash().put(key, hKey, value);
        } catch (Exception ex) {
            log.error("hPut异常：{}，key={}，value={}", ex.getMessage(), key, value);
        }
    }

    /**
     * 往Hash中存入多个数据
     *
     * @param key    Redis键
     * @param values Hash键值对
     */
    public void hPutAll(Integer dbIndex, final String key, final Map<String, Object> values) {
        try {
            getRedisTemplate(dbIndex).opsForHash().putAll(key, values);
        } catch (Exception ex) {
            log.error("hPutAll异常：{}，key={}，values={}", ex.getMessage(), key, values);
        }
    }

    /**
     * 获取Hash中的数据
     *
     * @param key  Redis键
     * @param hKey Hash键
     * @return Hash中的对象
     */
    public Object hGet(Integer dbIndex, final String key, final String hKey) {
        try {
            return getRedisTemplate(dbIndex).opsForHash().get(key, hKey);
        } catch (Exception ex) {
            log.error("hGet异常：{}，key={}，hKey={}", ex.getMessage(), key, hKey);
        }
        return null;
    }

    /**
     * 获取多个Hash中的数据
     *
     * @param key   Redis键
     * @param hKeys Hash键集合
     * @return Hash对象集合
     */
    public List<Object> hMultiGet(Integer dbIndex, final String key, final Collection<Object> hKeys) {
        try {
            return getRedisTemplate(dbIndex).opsForHash().multiGet(key, hKeys);
        } catch (Exception ex) {
            log.error("hMultiGet异常：{}，key={}，hKeys={}", ex.getMessage(), key, hKeys);
        }
        return null;
    }

    // 存储Set相关操作

    /**
     * 往Set中存入数据
     *
     * @param key    Redis键
     * @param values 值
     * @return 存入的个数
     */
    public long sSet(Integer dbIndex, final String key, final Object... values) {
        Long count = null;
        try {
            count = getRedisTemplate(dbIndex).opsForSet().add(key, values);
        } catch (Exception ex) {
            log.error("sSet异常：{}，key={}，value={}", ex.getMessage(), key, values);
        }
        return count == null ? 0 : count;
    }

    /**
     * 删除Set中的数据
     *
     * @param key    Redis键
     * @param values 值
     * @return 移除的个数
     */
    public long sDel(Integer dbIndex, final String key, final Object... values) {
        Long count = null;
        try {
            count = getRedisTemplate(dbIndex).opsForSet().remove(key, values);
        } catch (Exception ex) {
            log.error("sDel异常：{}，key={}，value={}", ex.getMessage(), key, values);
        }
        return count == null ? 0 : count;
    }

    // 存储List相关操作

    /**
     * 往List中存入多个数据
     *
     * @param key    Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public long lPushAll(Integer dbIndex, final String key, final Collection<Object> values) {
        Long count = null;
        try {
            count = getRedisTemplate(dbIndex).opsForList().rightPushAll(key, values);
        } catch (Exception ex) {
            log.error("lPushAll异常：{}，key={}，values={}", ex.getMessage(), key, values);
        }
        return count == null ? 0 : count;
    }

    /**
     * 往List中存入多个数据
     *
     * @param key    Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public long lPushAll(Integer dbIndex, final String key, final Object... values) {
        Long count = null;
        try {
            count = getRedisTemplate(dbIndex).opsForList().rightPushAll(key, values);
        } catch (Exception ex) {
            log.error("lPushAll异常：{}，key={}，value={}", ex.getMessage(), key, values);
        }
        return count == null ? 0 : count;
    }

    /**
     * 从List中获取begin到end之间的元素
     *
     * @param key   Redis键
     * @param start 开始位置
     * @param end   结束位置（start=0，end=-1表示获取全部元素）
     * @return List对象
     */
    public List<Object> lGet(Integer dbIndex, final String key, final int start, final int end) {
        try {
            return getRedisTemplate(dbIndex).opsForList().range(key, start, end);
        } catch (Exception ex) {
            log.error("lGet异常：{}，key={}", ex.getMessage(), key);
            return null;
        }
    }

    public Set<String> getKeys(Integer dbIndex, String prefix) {
        try {
            return getRedisTemplate(dbIndex).keys(prefix + "*");
        } catch (Exception ex) {
            log.error("getKeys异常：{}，prefix={}", ex.getMessage(), prefix);
            return null;
        }
    }

    public boolean checkList(Integer dbIndex, String listKey) {
        // 获取 list 的长度
        Long listLength = getRedisTemplate(dbIndex).opsForList().size(listKey);
        return listLength != null && listLength > 0;
    }
}
