package com.limo.waste.tcp;

import java.io.*;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * @Author limo
 * @Date 2024/11/29 14:05
 * @Description: 处理每个客户端的线程
 */
public class ClientHandler implements Runnable{
    private static final Logger log = Logger.getLogger(ClientHandler.class.getName());

    private final Socket clientSocket;
    private PrintWriter writer;
    private BufferedReader reader;

    public ClientHandler(Socket clientSocket){
        this.clientSocket = clientSocket;
        try {
            this.reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            this.writer = new PrintWriter(clientSocket.getOutputStream(), true);
        }catch (IOException e){
            log.severe("客户端"+clientSocket.getInetAddress()+"输入输出流初始化失败："+e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = reader.readLine()) != null){
                log.info(String.format("收到客户端【%s】消息：%s",clientSocket.getInetAddress().toString()+clientSocket.getPort(), message));
                if (!message.contains("客户端收到")){
                    sendMessage("服务器收到");
                }
                if ("exit".equalsIgnoreCase(message)){
                    break;
                }
            }
            /* 暂时注释
            //读取消息头（消息长度）
            byte[] lengthBytes = new byte[4];//假设消息头长度为4字节（表示消息体的长度）
            inputStream.read(lengthBytes);
            int messageLength = new CommonUtil().byteArrayToInt(lengthBytes);

            //拂去完整的消息体
            byte[] messageBytes = new byte[messageLength];
            inputStream.read(messageBytes);
            String encryptedCompressedMessage = new String(messageBytes);

            String decryptedMessage = new CommonUtil().decrypt(encryptedCompressedMessage);
            String decompressedMessage = new CommonUtil().decompress(decryptedMessage);

            log.info(String.format("收到客户端【%s】消息：%s",clientSocket.getInetAddress(), decompressedMessage));

            //恢复消息并加密压缩后发送
            String response = "服务器回复：收到";
            String compressedResponse = new CommonUtil().compress(response);
            String encryptedResponse = new CommonUtil().encrypt(compressedResponse);

            //发送消息长度 + 消息体
            byte[] responseBytes = encryptedResponse.getBytes();
            byte[] lengthBytesToSend = new CommonUtil().intToByteArray(responseBytes.length);
            outputStream.write(lengthBytesToSend);//先发消息头
            outputStream.write(responseBytes);

            reader.close();
            writer.close();
            clientSocket.close();*/
        }catch (IOException e){
            log.severe(String.format("处理客户端【%s】请求时出错：%s",clientSocket.getInetAddress(), e));
        }finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                log.severe("关闭客户端"+clientSocket.getInetAddress()+clientSocket.getPort()+"连接时出错: " + e.getMessage());
            }
            TCPServer.getClientHandlers().remove(clientSocket.getInetAddress().toString()+clientSocket.getPort());
            log.info("客户端【"+clientSocket.getInetAddress()+clientSocket.getPort()+"】断开连接");
        }
    }

    public void sendMessage(String message){
        if (writer != null){
            writer.println(message);
            log.info("向客户端【"+clientSocket.getInetAddress()+clientSocket.getPort()+"】发送消息："+message);
        }
    }
}
