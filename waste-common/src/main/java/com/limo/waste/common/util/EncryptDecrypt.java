package com.limo.waste.common.util;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author limo
 * @Date 2024/9/2 10:48
 * @Description:
 */
public class EncryptDecrypt {

        private static String salt;

        public static void main(String[] args) {
            /*// 读取配置文件
            readConfig();

            if (args.length != 2) {
                System.out.println("Usage: java EncryptDecrypt -e <plaintext> | -d <encryptedtext>");
                return;
            }

            String option = args[0];
            String input = args[1];

            try {
                if (option.equals("-e")) {
                    String encrypted = encrypt(input);
                    System.out.println(encrypted);
                } else if (option.equals("-d")) {
                    String decrypted = decrypt(input);
                    System.out.println(decrypted);
                } else {
                    System.out.println("Invalid option. Use -e to encrypt and -d to decrypt.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }*/
            try {
                salt = "pass:Sanshaoye#123";
                System.out.println(encrypt("H186650350"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 读取配置文件
        private static void readConfig() {
            try {
                List<String> lines = Files.readAllLines(Paths.get("config.ini"));
                Map<String, String> config = new HashMap<>();
                for (String line : lines) {
                    line = line.trim();
                    if (line.startsWith("#") || line.isEmpty()) {
                        continue;  // 跳过注释和空行
                    }
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        config.put(parts[0].trim(), parts[1].trim());
                    }
                }
                salt = config.get("SALT");
            } catch (Exception e) {
                System.out.println("Error reading config.ini: " + e.getMessage());
            }
        }

        // 加密函数
        private static String encrypt(String plaintext) throws Exception {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec key = new SecretKeySpec(salt.getBytes(), "AES");
            IvParameterSpec iv = new IvParameterSpec(salt.getBytes()); // 使用盐值作为 IV
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);
            byte[] encrypted = cipher.doFinal(plaintext.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(encrypted);
        }

        // 解密函数
        private static String decrypt(String encryptedText) throws Exception {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec key = new SecretKeySpec(salt.getBytes(), "AES");
            IvParameterSpec iv = new IvParameterSpec(salt.getBytes()); // 使用盐值作为 IV
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
            return new String(decrypted, "UTF-8");
        }

}
