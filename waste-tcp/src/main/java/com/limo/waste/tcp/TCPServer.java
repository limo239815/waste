package com.limo.waste.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.logging.Logger;

/**
 * @Author limo
 * @Date 2024/11/29 13:55
 * @Description:
 */

public class TCPServer {

    private static final Logger log = Logger.getLogger(TCPServer.class.getName());
    //private static final List<ClientHandler> clients = new CopyOnWriteArrayList<>(); // 线程安全的列表
    private static final Map<String, ClientHandler> clientHandlers = new ConcurrentHashMap<>();
    private static final ExecutorService clientThreadPool = Executors.newFixedThreadPool(10);

    private static final  int port = 18188;
    private static PrintWriter writer;

    public void init(){
        try (ServerSocket serverSocket = new ServerSocket(port)){
            log.info("服务器已启动，等待连接");
            while (true){
                Socket clientSocket = serverSocket.accept();
                log.info(String.format("客户端【%s】已连接",clientSocket.getInetAddress()));
                //为每个连接创建新的客户端处理器
                ClientHandler handler = new ClientHandler(clientSocket);
                clientHandlers.put(clientSocket.getInetAddress().toString()+clientSocket.getPort(),handler);
                clientThreadPool.submit(handler);
            }
        } catch (IOException e) {
            log.severe(String.format("服务器启动失败: %s", e.getMessage()));
        }
    }

    public static void sendMessage(String clientAddress,String port, String message){
        ClientHandler handler = clientHandlers.get(clientAddress+port);
        if (handler!=null){
            handler.sendMessage(message);
        }else {
            log.warning("客户端【"+clientAddress+"】未连接");
        }
    }

    public static Map<String, ClientHandler> getClientHandlers(){
        return clientHandlers;
    }

}
