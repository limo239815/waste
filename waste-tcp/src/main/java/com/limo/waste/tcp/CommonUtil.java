package com.limo.waste.tcp;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @Author limo
 * @Date 2024/11/29 14:11
 * @Description:
 */
public class CommonUtil {
    private static final Logger log = Logger.getLogger(CommonUtil.class.getName());
    private static final String SECRET_KEY = "1234245404656789";// 16字节的密钥（AES要求16字节）

    public String encrypt(String str){
        try {
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(),"AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(str.getBytes());
            return new String(encrypted);
        }catch (Exception e){
            log.severe(String.format("加密失败: %s", e.getMessage()));
        }
        return null;
    }

    public String decrypt(String str){
        try {
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decrypted = cipher.doFinal(str.getBytes());
            return new String(decrypted);
        }catch (Exception e){
            log.severe(String.format("解密失败: %s", e.getMessage()));
        }
        return null;
    }

    //压缩字符串
    public String compress(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gzipOutputStream.write(str.getBytes());
        gzipOutputStream.close();
        return byteArrayOutputStream.toString("ISO-8859-1");
    }
    //解压
    public String decompress(String str) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gzipInputStream));
        StringBuilder decompressedMessage = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            decompressedMessage.append(line);
        }
        return decompressedMessage.toString();
    }

    //讲字节数组转换为整数（用于消息头）
    public int byteArrayToInt(byte[] bytes){
        return (bytes[0] & 0xFF) << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF);
    }

    //讲整数转换为字节数组
    public byte[] intToByteArray(int value){
        return new byte[]{
                (byte)(value >> 24),
                (byte)(value >> 16),
                (byte)(value >> 8),
                (byte)value
        };
    }

}
