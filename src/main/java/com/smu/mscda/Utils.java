package com.smu.mscda;


import org.apache.commons.lang3.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

    // 将字符串首字母大写
    public static String capitalizeString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        // 使用 Apache Commons Lang 中的 StringUtils.capitalize
        return StringUtils.capitalize(input);
    }

    // 生成 MD5 并转换为 16 进制字符串
    public static String generateMD5Hex(String input) {
        if (input == null) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());
            // 将字节数组转换为十六进制
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // 理论上不会发生，如果 MD5 不被支持时才会出现
            throw new RuntimeException(e);
        }
    }
}