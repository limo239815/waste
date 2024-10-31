package com.limo.waste.grpc.util.cache;

import bill.service.v1.billGrpc;
import com.common.query.grpc.OfbizCommonGrpc;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author limo
 *
 * @Description grpc client 配置类
 */
@Configuration
public class GrpcClientConfig {

    @Bean
    public OfbizCommonGrpc.OfbizCommonBlockingStub getOfbizServerClient(){
        return OfbizCommonGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(getAddress(true)).usePlaintext().build());
    }

    @Bean
    public billGrpc.billBlockingStub getBillServerClient(){
        //初始化连接
        return billGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(getAddress(false)).usePlaintext().build());
    }

    private String getAddress(boolean query){
        if (query){
            return "127.0.0.1:50052";
        }else {
            return "127.0.0.1:9004";
        }
    }
}
