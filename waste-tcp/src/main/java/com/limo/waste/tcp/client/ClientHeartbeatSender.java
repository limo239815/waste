package com.limo.waste.tcp.client;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @Author limo
 * @Date 2024/11/29 16:57
 * @Description: 发送心跳
 */
public class ClientHeartbeatSender implements Runnable{
    private static final Logger log = Logger.getLogger(ClientHeartbeatSender.class.getName());

    private static  final  long HEARTBEAT_INTERVAL = 10000;

    private final PrintWriter writer;

    public ClientHeartbeatSender(PrintWriter writer){
        this.writer = writer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(HEARTBEAT_INTERVAL);
                writer.println("HEARTBEAT");
                log.info("向服务器发送心跳消息");
            }
        } catch (InterruptedException e) {
            log.severe("客户端心跳消息发送线程异常: " + e.getMessage());
        }
    }
}
