package com.limo.waste.common.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author limo
 *
 * @Description http请求
 */
@Slf4j
@Component
public class HttpUtil {

    @Resource
    RestTemplate restTemplate;

    public ResponseEntity<String>  post(String url,String data){
        log.info("请求地址：{}，请求参数：{}",url,data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data,httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url,entity,String.class);
        }catch (Exception e){
            log.error("请求异常：{}",e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求返回结果：{}",response);
        return response;
    }
    public Result<Boolean> postForNoData(String url, String data){
        log.info("请求地址：{}，请求参数：{}",url,data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data,httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url,entity,String.class);
            log.info("请求地址：{}，返回结果：{}",url,response.getStatusCode());
            if (response.getStatusCode() != HttpStatus.OK){
                return Result.fail(Result.FAIL_CODE,response.toString());
            }
            return Result.success();
        }catch (Exception e){
            log.error("请求异常：{}",e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求地址：{}，返回结果：{}",url,response);
        return Result.fail(Result.FAIL_CODE,response.toString());
    }

    public Result<?> postForRcs(String url, String data){
        log.info("请求地址：{}，请求参数：{}",url,data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data,httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url,entity,String.class);
            log.info("请求地址：{}，返回结果：{}",url,response);
            if (response.getStatusCode() != HttpStatus.OK){
                return Result.fail(Result.FAIL_CODE,response.toString());
            }
            return JSON.parseObject(response.getBody(),Result.class);
        }catch (Exception e){
            log.error("请求异常：{}",e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求地址：{}，返回结果：{}",url,response);
        return Result.fail(Result.FAIL_CODE,response.toString());
    }
    public Result<?> postForBill(String url, String data){
        log.info("请求地址：{}，请求参数：{}",url,data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(data,httpHeaders);
        ResponseEntity<String> response;
        try {
            response = restTemplate.postForEntity(url,entity,String.class);
            log.info("请求地址：{}，返回结果：{}",url,response);
            if (response.getStatusCode() != HttpStatus.OK){
                return Result.fail(Result.FAIL_CODE,response.toString());
            }
            GoResult<?> result = JSON.parseObject(response.getBody(),GoResult.class);
            if (result == null || !StringUtils.hasLength(result.getResultCode())){
             return Result.fail(Result.FAIL_CODE,"请求失败："+ response);
            }
            if (GoResult.FAIL_CODE.equals(result.getResultCode())){
                return Result.fail(Result.FAIL_CODE,result.getResultMsg(),result.getResultValue());
            }
            return Result.success(Result.SUCCESS_CODE,result.getResultMsg(),result.getResultValue());
        }catch (Exception e){
            log.error("请求异常：{}",e.getMessage());
            HttpStatus status = HttpStatus.BAD_REQUEST;
            response = new ResponseEntity<>(status);
        }
        log.info("请求地址：{}，返回结果：{}",url,response);
        return Result.fail(Result.FAIL_CODE,response.toString());
    }
}
