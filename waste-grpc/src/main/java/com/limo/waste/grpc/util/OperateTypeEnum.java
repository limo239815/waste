package com.limo.waste.grpc.util;

/**
 * @Author limo
 * @Date 2024/7/23 15:45
 * @Description: 操作类型
 */
public enum OperateTypeEnum {
    CREATE("新增","create","1"),
    EDIT("修改","edit","2"),
    DELETE("删除", "delete","3"),
    QUERY("查询", "query","4"),
    VIEW("查看", "view","5"),
    SEND_CHECK("执行", "sendcheck","6"),
    CHECK("执行", "check","7"),
    UNCHECK("撤销执行", "uncheck","26"),
    RETURN("驳回", "return","8"),
    END("终止", "end","12"),
    DOWN("接口下载", "down","22"),
    END_BALANCE("结账", "endbalance","9"),
    EXPORT_IN("导入", "exportin","10"),
    EXPORT_OUT("导出", "exportout","11"),
    COPY("复制", "copy","13"),
    PRINT("打印", "print","15"),
    RESET_PASS("密码重置", "resetpass","16"),
    UPDATE_DDTENANT("更新租户", "updateddtenant","17"),
    BATCH_CHECK("批量审批", "batchcheck","18"),
    BATCH_SEND_CHECK("批量执行", "batchsendcheck","19"),
    BATCH_EDIT("批量修改", "batchedit","20"),
    LOAD("接口上传", "load","21"),
    MEMO_SAVE("备注保存", "memosave","23"),
    FILE_LOAD("文件上传", "fileload","24"),
    FILE_DOWN("文件下载", "filedown","25"),
    TEMPLATE_EXPORT("模板导出", "templateexport","27"),
    BATCH_SETTLEMENT("强制完成", "batchsettlement","28"),
    BATCH_PAYMENT("强制取消", "batchPayment","29"),
    INV_SYNC("同步库存", "InvSync","30"),
    BATCH_GENERATE("批量生成", "batchgenerate","31"),
    CLOSE_CONTAINER("关闭容器", "closeContainer","32"),
    CLOSE_ORDER("关闭订单", "closeOrder","33"),
    ACCEPT("领取", "accept","34"),
    TO_OPERATE("进入", "toOperate","35"),
    CALL_CONTAINER("到左工位", "callContainer","36"),
    START_CONTAINER("整托入库确认", "startContainer","37"),
    INSTOCK_MODE("入库模式", "instockMode","38"),
    OUT_STOCK_MODE("出库模式", "outstockMode","39"),
    ADJUST_MODE("盘点模式", "adjustMode","40"),
    RETURN_LOC("回库", "returnLoc","41"),
    CALL_CONTAINER_R("到右工位", "callContainerR","42"),
    RETURN_LOC_R("右工位回库", "returnLocR","43"),
    CONTAINER_OUTBOUND("整托下架", "ContainerOutbound","45"),
    DISMANTLE_OUTBOUND("拆零下架", "DismantleOutbound","46"),
    CHECK_INVENTORY("盘点完成", "CheckInventory","47"),
    GOON("重发任务", "goon","48"),
    KINGDEE_ACCESS_ASN("金蝶接入入库单", "KingdeeAccessAsn","49"),
    FINISH_BIND("完成绑定", "finishBind","50")
    ;

    private final String code;

    private final String key;

    private final String name;

    OperateTypeEnum(String name,String code,String key){
        this.code = code;
        this.name = name;
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
