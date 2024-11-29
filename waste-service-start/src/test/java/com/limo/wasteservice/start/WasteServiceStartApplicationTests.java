package com.limo.wasteservice.start;

import com.limo.waste.common.redis.RedisNewService;
import com.limo.waste.database.dal.Column;
import com.limo.waste.database.dal.DatabaseConfig;
import com.limo.waste.database.dal.Table;
import com.limo.waste.database.redis.RedisUtil;
import com.limo.waste.database.service.ds.DatabaseInitializer;
import com.limo.waste.grpc.service.CommonQueryService;
import com.limo.waste.grpc.util.SysParaUtil;
import com.limo.waste.grpc.util.UserUtil;
import com.limo.waste.tcp.TCPServer;
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
    void test5(){
        TCPServer tcpServer = new TCPServer();
        tcpServer.init();
    }

    @Test
    void test(){
            redisNewService.saveData("localhost","test","wao");
        System.out.println(redisNewService.getData("localhost","test"));
        redisNewService.saveData("47.100.125.240","test","wao");
        System.out.println(redisNewService.getData("47.100.125.240","test"));
    }

    @Resource
    RedisUtil redisUtil;

    @Test
    void test6(){
//        redisUtil.set(1,"test","waowao");
//        System.out.println(redisUtil.get(1,"test"));
        redisUtil.del(1,"test");
        System.out.println(redisUtil.get(1,"test"));
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

    @Resource
    UserUtil userUtil;

    @Resource
    SysParaUtil sysParaUtil;

    @Test
    public void test3(){
        /*User user = userUtil.getUser(new User().setEmployeeId("20230714001").setDdTenantId("00000"));
        System.out.println(user);*/

        //System.out.println(sysParaUtil.initSysPara("00000","Counting"));

    }
    @Resource
    CommonQueryService commonQueryService;

    @Test
    public void test4(){

    }

    public static void main(String[] args) {
        String javaForLoop = "for (int i = 0; i < 5; i++) { System.out.println(i); }";
        String pythonForLoop = convertForLoopToPython(javaForLoop);
        System.out.println(pythonForLoop);
    }

    public static String convertForLoopToPython(String javaForLoop) {
        // 假设Java循环格式为: for (int i = 0; i < N; i++)
        // 该方法仅处理简单的for循环，不支持复杂条件

        // 提取循环变量、起始值、条件、增量
        String loopHeader = javaForLoop.substring(javaForLoop.indexOf('(') + 1, javaForLoop.indexOf(')'));
        String[] parts = loopHeader.split(";");

        // 提取起始值 (int i = 0)
        String[] initPart = parts[0].trim().split(" ");
        String varName = initPart[1];
        String startValue = initPart[3];

        // 提取结束条件 (i < N)
        String endCondition = parts[1].trim();
        String endValue = endCondition.substring(endCondition.indexOf('<') + 1).trim();

        // 提取增量 (i++)
        String increment = parts[2].trim();

        // 生成Python的for循环
        String pythonLoop = "for " + varName + " in range(" + startValue + ", " + endValue + "):";

        // 处理循环体
        String body = javaForLoop.substring(javaForLoop.indexOf('{') + 1, javaForLoop.lastIndexOf('}')).trim();
        pythonLoop += "\n    " + body.replace("System.out.println", "print").replace(";", "");

        return pythonLoop;
    }


}
