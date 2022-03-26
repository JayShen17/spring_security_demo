package com.atguigu;

import com.atguigu.util.MD5Utils;

public class test {
    public static void main(String[] args) {
        String md5 = MD5Utils.md5("123");
        System.out.println("md5 = " + md5);
    }
}
