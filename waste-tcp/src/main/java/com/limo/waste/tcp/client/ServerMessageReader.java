package com.limo.waste.tcp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * @Author limo
 * @Date 2024/11/29 15:53
 * @Description: 读取服务器消息
 */
public class ServerMessageReader implements Runnable{
    private static final Logger log = Logger.getLogger(ServerMessageReader.class.getName());

    private final PrintWriter writer;
    private final BufferedReader reader;

    public ServerMessageReader(PrintWriter writer, BufferedReader reader){
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = reader.readLine())!=null){
                log.info("收到服务器消息："+message);
                if (!message.contains("服务器收到")){
                    writer.println("客户端收到");
                }
            }
        }catch (IOException e){
            log.severe("接收服务器消息失败: " + e.getMessage());
        }
    }
}
