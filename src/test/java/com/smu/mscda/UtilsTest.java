package com.smu.mscda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testCapitalizeString_normal() {
        String input = "smu";
        String expected = "Smu";
        String actual = Utils.capitalizeString(input);
        Assertions.assertEquals(expected, actual,
                "capitalizeString 应该只把第一个字母变成大写");
    }

    @Test
    void testCapitalizeString_empty() {
        String input = "";
        String actual = Utils.capitalizeString(input);
        Assertions.assertEquals("", actual,
                "空字符串经过 capitalizeString 后仍应是空字符串");
    }

    @Test
    void testGenerateMD5Hex_normal() {
        String input = "smu";
        // "smu" 的 MD5 预先算好：6850c0ee0db4626bbdda5660167f0d4c
        String expectedMD5 = "3773300c2f413cc7136f8d74b305519c";
        String actualMD5 = Utils.generateMD5Hex(input);
        Assertions.assertEquals(expectedMD5, actualMD5,
                "MD5 应该与 'smu' 预期值相同");
    }

    @Test
    void testGenerateMD5Hex_null() {
        String input = null;
        String actualMD5 = Utils.generateMD5Hex(input);
        Assertions.assertNull(actualMD5,
                "generateMD5Hex(null) 应返回 null");
    }
}
