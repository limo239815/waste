package com.limo.waste.common.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Author
 *
 * @Description redis服务
 */
public interface RedisSecondService {
    /**
     * 存值
     * @param  key 键
     * @param value 值
     * @return true 成功 false 失败
     */
    Result<Boolean> lPush(String key, Object value);

    /**
     * 取值 - <rpop：非阻塞式>
     * @param key 键
     * @return Object
     */
    Object rpop(String key);

    /**
     * 取值 - <brpop：阻塞式> - 推荐使用
     * @param key 键
     * @param timeout 超时时间
     * @param timeUnit 给定单元粒度的时间段
     *                 TimeUnit.DAYS          //天
     *                 TimeUnit.HOURS         //小时
     *                 TimeUnit.MINUTES       //分钟
     *                 TimeUnit.SECONDS       //秒
     *                 TimeUnit.MILLISECONDS  //毫秒
     * @return Object
     */
    Object brpop(String key, long timeout, TimeUnit timeUnit);
    /**
     * 取值 - <brpop：阻塞式>
     * @param key 键
     * @return Object
     */
    Object brpop(String key);
    /**
     * 设置有效时间
     *
     * @param key Redis键
     * @param timeout 超时时间
     * @return true=设置成功；false=设置失败
     */
    Result<Boolean> expire(final String key, final long timeout);

    /**
     * 设置有效时间
     *
     * @param key Redis键
     * @param timeout 超时时间
     * @param unit 时间单位
     * @return true=设置成功；false=设置失败
     */
    Result<Boolean> expire(final String key, final long timeout, final TimeUnit unit);

    /**
     * 删除单个key
     *
     * @param key 键
     * @return true=删除成功；false=删除失败
     */
    Result<Boolean> del(final String key);

    /**
     * 删除多个key
     *
     * @param keys 键集合
     * @return 成功删除的个数
     */
    long del(final Collection<String> keys);

    /**
     * 存入普通对象
     *
     * @param key Redis键
     * @param value 值
     */
    void set(final String key, final Object value);

    // 存储普通对象操作

    /**
     * 存入普通对象
     *
     * @param key 键
     * @param value 值
     * @param timeout 有效期，单位秒
     */
    void set(final String key, final Object value, final long timeout);

    /**
     * 获取普通对象
     *
     * @param key 键
     * @return 对象
     */
    Object get(final String key);

    // 存储Hash操作

    /**
     * 往Hash中存入数据
     *
     * @param key Redis键
     * @param hKey Hash键
     * @param value 值
     */
    void hPut(final String key, final String hKey, final Object value);

    /**
     * 往Hash中存入多个数据
     *
     * @param key Redis键
     * @param values Hash键值对
     */
    void hPutAll(final String key, final Map<String, Object> values);

    /**
     * 获取Hash中的数据
     *
     * @param key Redis键
     * @param hKey Hash键
     * @return Hash中的对象
     */
    Object hGet(final String key, final String hKey);

    /**
     * 获取多个Hash中的数据
     *
     * @param key Redis键
     * @param hKeys Hash键集合
     * @return Hash对象集合
     */
    List<Object> hMultiGet(final String key, final Collection<Object> hKeys);

    // 存储Set相关操作

    /**
     * 往Set中存入数据
     *
     * @param key Redis键
     * @param values 值
     * @return 存入的个数
     */
    long sSet(final String key, final Object... values);

    /**
     * 删除Set中的数据
     *
     * @param key Redis键
     * @param values 值
     * @return 移除的个数
     */
    long sDel(final String key, final Object... values);

    // 存储List相关操作



    /**
     * 往List中存入多个数据
     *
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    long lPushAll(final String key, final Collection<Object> values);

    /**
     * 往List中存入多个数据
     *
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    long lPushAll(final String key, final Object... values);

    /**
     * 从List中获取begin到end之间的元素
     *
     * @param key Redis键
     * @param start 开始位置
     * @param end 结束位置（start=0，end=-1表示获取全部元素）
     * @return List对象
     */
    List<Object> lGet(final String key, final int start, final int end);

    /**
     * 获取所有key根据key前缀
     *
     * @param prefix 键前缀
     * @return 对象
     */
    Set<String> getKeys(final String prefix);
}
