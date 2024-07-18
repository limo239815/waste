package com.limo.wasteservice.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.limo","com.common.query.grpc","bill.service.v1"})
@EnableAsync
@EnableFeignClients(basePackages = "com.limo.waste.feign.api")
public class WasteServiceStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(WasteServiceStartApplication.class, args);
    }

}
