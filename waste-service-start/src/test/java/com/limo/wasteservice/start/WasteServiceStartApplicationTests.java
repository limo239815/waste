package com.limo.wasteservice.start;

import com.limo.waste.common.redis.RedisNewService;
import com.limo.waste.database.dal.Column;
import com.limo.waste.database.dal.DatabaseConfig;
import com.limo.waste.database.dal.Table;
import com.limo.waste.database.service.ds.DatabaseInitializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class WasteServiceStartApplicationTests {

    @Resource
    RedisNewService redisNewService;

    @Test
    void test(){
            redisNewService.saveData("localhost","test","wao");
        System.out.println(redisNewService.getData("localhost","test"));
        redisNewService.saveData("47.100.125.240","test","wao");
        System.out.println(redisNewService.getData("47.100.125.240","test"));
    }

    @Resource
    DatabaseInitializer databaseInitializer;
    @Test
    public void test2(){
        try {
            List<Column> columns = new ArrayList<>();
            columns.add(new Column().setName("id").setType("int").setAutoIncrement(true).setNotNUll(true)
                    .setPrimaryKey(true));
            columns.add(new Column().setName("name").setType("VARCHAR(50)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(false));
            columns.add(new Column().setName("ddTenantId").setType("VARCHAR(20)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(true));
            List<Column> columns2 = new ArrayList<>();
            columns2.add(new Column().setName("id").setType("int").setAutoIncrement(true).setNotNUll(true)
                    .setPrimaryKey(true));
            columns2.add(new Column().setName("name").setType("VARCHAR(50)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(false));
            columns2.add(new Column().setName("ddTenantId").setType("VARCHAR(20)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(true));
            List<Table> tables = new ArrayList<>();
            tables.add(new Table().setName("order1").setColumns(columns));
            tables.add(new Table().setName("order2").setColumns(columns2));
            DatabaseConfig config = new DatabaseConfig().setDatabase("ttest")
                    .setTables(tables);
            //new DatabaseInitializer().initializeForUrl(config);
            databaseInitializer.initialize(config);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
