package com.limo.waste.database.service.ds;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author
 *
 * @Description 数据源工具
 */
@Component
@Slf4j
public class DatasourceUtils {

//    @Resource
//    BusinessEntityMapper businessEntityMapper;
//
//    public void changDatasource(String entityId,String ddTenantId){
//        log.info("数据源切换：实体{}，租户：{}",entityId,ddTenantId);
//        BusinessEntityDO businessEntityDO = businessEntityMapper.findOne(entityId,ddTenantId);
//        if (businessEntityDO == null){
//            DynamicDataSourceContextHolder.setContextKey(DataSourceConstant.DS_KEY_MASTER);
//            return;
//        }
//        String key;
//        if (ddTenantId.equals("00000")){
//            key = businessEntityDO.getEntityGroup()+ddTenantId+"self";
//        }else {
//            key = businessEntityDO.getEntityGroup()+ddTenantId;
//        }
//        log.info("数据源切换：key={}",key);
//        DynamicDataSourceContextHolder.setContextKey(key);
//    }

}
