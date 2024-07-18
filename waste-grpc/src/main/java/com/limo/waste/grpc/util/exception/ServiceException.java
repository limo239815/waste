package com.limo.waste.grpc.util.exception;

/**
 * @author chenwenwen
 * @version V1.0.0
 * @date 2023/4/20 13:08
 * @description 通用异常
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
