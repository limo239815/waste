package com.limo.waste.grpc.util.messagebus;

import com.google.gson.Gson;
import com.limo.waste.common.util.HttpUtil;
import com.limo.waste.common.util.IDUtils;
import com.limo.waste.common.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author
 * @Description 消息总线服务工具
 */
@Component
public class SendMessageUtil {

    @Resource
    HttpUtil httpUtil;

    @Value("${messageBusUrl}")
    private String url;

    public Result<Boolean> send(MessageBusEnum messageBusEnum, String msgId, String data) {
        Map<String,Object> param = new HashMap<>();
        param.put("appCode",messageBusEnum.getAppCode());
        param.put("topic",messageBusEnum.getTopic());
        param.put("bizId",messageBusEnum.getBizId());
        param.put("payLoad",data);
        param.put("msgId",StringUtils.hasLength(msgId) ? msgId : IDUtils.getUuid(32));
        ResponseEntity<String> response = httpUtil.post(url, new Gson().toJson(param));
        if (response.getStatusCode() != HttpStatus.OK) {
            return Result.fail(Result.FAIL_CODE, "发送消息失败：" + response);
        }
        return Result.success();
    }
}
