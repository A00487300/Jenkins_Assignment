package com.smu.mscda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and generate MD5 hex!");
        System.out.print("\nEnter a string: ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine(); // 用户输入
        scanner.close();

        // 将输入字符串首字母大写
        String capitalized = Utils.capitalizeString(inputString);

        // 生成 MD5
        String md5Hex = Utils.generateMD5Hex(inputString);

        // 打印结果
        System.out.println("\nCapitalized string is: " + capitalized);
        System.out.println("\nMD5 Hex is: " + md5Hex);
    }
}