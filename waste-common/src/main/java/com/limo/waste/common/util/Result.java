package com.limo.waste.common.util;

import lombok.Data;

@Data
public class Result<T> {

    public static final String SUCCESS_CODE = "1";
    //成功但不可达
    public static final String SUCCESS_CODE_BUT_UNREACHABLE = "0";
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
    private String resultMessage;

    /**
     * 返回数据
     */
    private T resultValue;

    private Result() {
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setResultCode(SUCCESS_CODE);
        result.setResultMessage(SUCCESS_MESSAGE);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = success();
        result.setResultValue(data);
        return result;
    }

    public static <T> Result<T> success(String message, T data) {
        Result<T> result = success();
        result.setResultMessage(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> Result<T> success(String code, String message, T data) {
        Result<T> result = new Result<>();
        result.setResultCode(code);
        result.setResultMessage(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setResultCode(FAIL_CODE);
        result.setResultMessage(FAIL_MESSAGE);
        return result;
    }

    public static <T> Result<T> fail(T data) {
        Result<T> result = fail();
        result.setResultValue(data);
        return result;
    }

    public static <T> Result<T> fail(String message, T data) {
        Result<T> result = fail();
        result.setResultMessage(message);
        result.setResultValue(data);
        return result;
    }

    public static <T> Result<T> fail(String code, String message) {
        Result<T> result = fail();
        result.setResultCode(code);
        result.setResultMessage(message);
        return result;
    }

    public static <T> Result<T> fail(String code, String message, T data) {
        Result<T> result = new Result<>();
        result.setResultCode(code);
        result.setResultMessage(message);
        result.setResultValue(data);
        return result;
    }
}