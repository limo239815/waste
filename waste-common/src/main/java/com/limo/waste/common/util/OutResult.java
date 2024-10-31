package com.limo.waste.common.util;


import lombok.Data;

/**
 * @Author limo
 *
 * @Description go结果
 */
@Data
public class OutResult<T> {

    public static final String SUCCESS_CODE = "1";
    //成功但不可达
    public static final String SUCCESS_CODE_BUT_UNREACHABLE="0";
    public static final String FAIL_CODE = "-1";
    public static final String SUCCESS_MESSAGE = "success";
    public static final String FAIL_MESSAGE = "fail";
    /**
     * 返回状态码
     */
    private String resultCode;
    /**
     * 返回信息
     */
    private String resultMsg;

    /**
     * 返回数据
     */
    private T resultValue;

    private OutResult() {
    }

    public static <T> OutResult<T> success() {
        OutResult<T> result = new OutResult<>();
        result.setResultCode(SUCCESS_CODE);
        result.setResultMsg(SUCCESS_MESSAGE);
        return result;
    }

    public static <T> OutResult<T> success(T data) {
        OutResult<T> result = success();
        result.setResultValue(data);
        return result;
    }

    public static <T> OutResult<T> success(String message, T data) {
        OutResult<T> result = success();
        result.setResultMsg(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> OutResult<T> success(String code, String message, T data) {
        OutResult<T> result = new OutResult<>();
        result.setResultCode(code);
        result.setResultMsg(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> OutResult<T> fail() {
        OutResult<T> result = new OutResult<>();
        result.setResultCode(FAIL_CODE);
        result.setResultMsg(FAIL_MESSAGE);
        return result;
    }

    public static <T> OutResult<T> fail(T data) {
        OutResult<T> result = fail();
        result.setResultValue(data);
        return result;
    }

    public static <T> OutResult<T> fail(String message, T data) {
        OutResult<T> result = fail();
        result.setResultMsg(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> OutResult<T> fail(String code, String message) {
        OutResult<T> result = fail();
        result.setResultCode(code);
        result.setResultMsg(message);
        return result;
    }

    public static <T> OutResult<T> fail(String code, String message, T data) {
        OutResult<T> result = new OutResult<>();
        result.setResultCode(code);
        result.setResultMsg(message);
        result.setResultValue(data);
        return result;
    }
}
