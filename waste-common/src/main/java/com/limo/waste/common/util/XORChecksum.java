package com.limo.waste.common.util;

/**
 * @Author
 * @Date
 * @Description: 异或校验
 */
public class XORChecksum {

    /**
     * 计算异或校验和
     * @param data 输入数据字节数组
     * @return 校验和
     * */
    public static byte calculateXORChecksum(byte[] data){
        byte checksum = 0;
        for (byte b : data){
            checksum ^= b;
        }
        return checksum;
    }
    /**
     * 验证异或校验和
     * @param data 输入数据字节数组
     * @param checksum 校验和
     * @return 数据是否正确
     * */
    public static boolean verifyXORChecksum(byte[] data, byte checksum){
        return calculateXORChecksum(data) == checksum;
    }

    public static void main(String[] args) {
        byte[] data = {0x01,0x02,0x03,0x04,0x05};
        //计算校验和
        byte checksum = calculateXORChecksum(data);
        System.out.printf(" 计算校验和结果：0x%02X\n",checksum);
        //验证数据
        boolean isValid = verifyXORChecksum(data,checksum);
        System.out.printf("数据校验结果：%b\n",isValid);

        data[0] = 0x06;
        //再次验证数据
        isValid = verifyXORChecksum(data,checksum);
        System.out.printf("再次数据校验结果：%b\n",isValid);
    }

}
