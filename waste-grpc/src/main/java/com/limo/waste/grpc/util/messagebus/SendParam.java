package com.limo.waste.grpc.util.messagebus;

import lombok.Data;

/**
 * @author chenwenwen
 * @date 2023/7/13 14:18
 * @description 消息发送接口参数
 */
@Data
public class SendParam {
    /**
     * 应用编号
     * */
    private String appCode;
    /**
     * 主题或消息分组
     * */
    private String topic;
    /**
     * 消息id，唯一标识
     * */
    private String msgId;
    /**
     * 业务ID
     * */
    private String bizId;
    /**
     * 发送的内容
     * */
    private String payLoad;

}
