package com.limo.waste.grpc.util.messagebus;

/**
 * @Author wen
 *
 * @Description 消息总线枚举
 */
public enum MessageBusEnum {

    AUTO_CHECK("location","locationTask_AutoCheck","9603"),
    KINGDEE_AUDIT("inf","magic-vvs-audit","9603"),
    KINGDEE_CREATE_SAL_OUTBOUND("location","magic-sy-create","9603"),
    ;

    /**
     * 应用编号
     * */
    private final String appCode;
    /**
     * 主题或消息分组
     * */
    private final String topic;
    /**
     * 业务ID
     * */
    private final String bizId;

    MessageBusEnum(String appCode, String topic, String bizId){
        this.appCode = appCode;
        this.topic = topic;
        this.bizId = bizId;
    }

    public String getAppCode() {
        return appCode;
    }

    public String getBizId() {
        return bizId;
    }


    public String getTopic() {
        return topic;
    }
}
