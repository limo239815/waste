package com.limo.waste.tcp.client;

import java.io.*;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * @Author limo
 * @Date 2024/11/29 14:33
 * @Description:
 */
public class TCPClient {

    private static final Logger log = Logger.getLogger(TCPClient.class.getName());

    private static final String SECRET_KEY = "1234245404656789";// 16字节的密钥（AES要求16字节）
    private static final  int port = 18188;
    private static final String serverAddress = "localhost";
    private static PrintWriter writer;

    public void connect(){
        try {
            Socket socket = new Socket(serverAddress, port);
            log.info(String.format("已连接到服务器，服务器地址: %s, 端口: %d", serverAddress, port));

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(outputStream, true);
            //向服务器发送消息
            writer.println("Hello,Server");
            new Thread(new ServerMessageReader(writer, reader)).start();
            new Thread(new ClientHeartbeatSender(writer)).start();
        } catch (IOException e) {
            log.severe(String.format("客户端连接或通信异常: %s", e.getMessage()));
        }
    }

    public static void sendMessage(String message){
        if (writer != null){
            writer.println(message);
            log.info("发送消息："+message);
        }
    }

}
