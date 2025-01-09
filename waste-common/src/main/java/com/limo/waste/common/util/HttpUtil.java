package com.limo.waste.common.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Objects;

/**
 * @Author limo
 * @Description http请求
 */
@Slf4j
@Component
public class HttpUtil {

    @Resource
    RestTemplate restTemplate;

    public ResponseEntity<String> post(String url, String data) {
        log.info("请求地址：{}，请求参数：{}", url, data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求地址：{}，请求结果：{}", url, response);
        return response;
    }

    public ResponseEntity<String> post(String url, String data, Map<String, String> headerValue) {
        log.info("请求地址：{}，请求参数：{}，请求头：{}", url, data, headerValue);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        for (String key : headerValue.keySet()) {
            httpHeaders.set(key, headerValue.get(key));
        }
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求地址：{}，请求结果：{}", url, response);
        return response;
    }

    public Result<Boolean> postForNoData(String url, String data) {
        log.info("请求地址：{}，请求参数：{}", url, data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            return Result.success();
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }

    public Result<Boolean> postForNoData(String url, String data, Map<String, String> headerValue) {
        log.info("请求地址：{}，请求参数：{}，请求头：{}", url, data, headerValue);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        for (String key : headerValue.keySet()) {
            httpHeaders.set(key, headerValue.get(key));
        }
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            return Result.success();
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }

    public Result<?> postForResult(String url, String data, Map<String, String> headerValue) {
        log.info("请求地址：{}，请求参数：{}，请求头：{}", url, data, headerValue);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        for (String key : headerValue.keySet()) {
            httpHeaders.set(key, headerValue.get(key));
        }
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            return JSON.parseObject(result, Result.class);
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }

    public Result<?> postForResult(String url, String data) {
        log.info("请求地址：{}，请求参数：{}", url, data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            return JSON.parseObject(result, Result.class);
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }

    public Result<?> postForOutResult(String url, String data, Map<String, String> headerValue) {
        log.info("请求地址：{}，请求参数：{}，请求头：{}", url, data, headerValue);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        for (String key : headerValue.keySet()) {
            httpHeaders.set(key, headerValue.get(key));
        }
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            String body = response.getBody();
            OutResult<?> resultForOut = JSON.parseObject(body, OutResult.class);

            if (result == null || Objects.isNull(resultForOut) || !StringUtils.hasLength(resultForOut.getResultCode())) {
                Map bodyM = JSON.parseObject(body, Map.class);
                if (!CollectionUtils.isEmpty(bodyM) && bodyM.containsKey("errorMessage")) {
                    return Result.fail(Result.FAIL_CODE, "请求失败：" + bodyM.get("errorMessage"));
                }
                return Result.fail(Result.FAIL_CODE, "请求失败：" + body);
            }
            if (OutResult.FAIL_CODE.equals(resultForOut.getResultCode())) {
                return Result.fail(Result.FAIL_CODE, resultForOut.getResultMsg(), resultForOut.getResultValue());
            }
            return Result.success(Result.SUCCESS_CODE, resultForOut.getResultMsg(), resultForOut.getResultValue());
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }

    public Result<?> postForOutResult(String url, String data) {
        log.info("请求地址：{}，请求参数：{}", url, data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data, httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url, entity, String.class);
            log.info("请求地址：{}，返回结果：{}", url, response.getStatusCode());
            String result = response.getBody();
            log.info("请求地址：{}，返回结果体：{}", url, result);
            if (response.getStatusCode() != HttpStatus.OK) {
                return Result.fail(Result.FAIL_CODE, response.toString());
            }
            String body = response.getBody();
            OutResult<?> resultForOut = JSON.parseObject(body, OutResult.class);

            if (result == null || Objects.isNull(resultForOut) || !StringUtils.hasLength(resultForOut.getResultCode())) {
                Map bodyM = JSON.parseObject(body, Map.class);
                if (!CollectionUtils.isEmpty(bodyM) && bodyM.containsKey("errorMessage")) {
                    return Result.fail(Result.FAIL_CODE, "请求失败：" + bodyM.get("errorMessage"));
                }
                return Result.fail(Result.FAIL_CODE, "请求失败：" + body);
            }
            if (OutResult.FAIL_CODE.equals(resultForOut.getResultCode())) {
                return Result.fail(Result.FAIL_CODE, resultForOut.getResultMsg(), resultForOut.getResultValue());
            }
            return Result.success(Result.SUCCESS_CODE, resultForOut.getResultMsg(), resultForOut.getResultValue());
        } catch (Exception e) {
            log.error("请求异常：{}", e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        return Result.fail(Result.FAIL_CODE, response.toString());
    }
}
