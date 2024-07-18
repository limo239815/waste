package com.limo.waste.grpc.util.cache;

import bill.service.v1.billGrpc;
import com.common.query.grpc.OfbizCommonGrpc;
import com.limo.waste.grpc.util.UrlConstant;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chenwenwen
 *
 * @Description grpc client 配置类
 */
@Configuration
public class GrpcClientConfig {

    @Value(UrlConstant.COMMON_QUERY_URL)
    private String commonQueryAddress;

    @Value(UrlConstant.COMMON_UPDATE_URL)
    private String commonUpdateAddress;

    @Bean
    public OfbizCommonGrpc.OfbizCommonBlockingStub getOfbizServerClient(){
        return OfbizCommonGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(commonQueryAddress).usePlaintext().build());
    }

    @Bean
    public billGrpc.billBlockingStub getBillServerClient(){
        //初始化连接
       return billGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(commonUpdateAddress).usePlaintext().build());
    }
}
