package com.atguigu;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestBPE {
    public static void main(String[] args) {
        BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
        String encode = bpe.encode("123");
        System.out.println("encode = " + encode);
    }
}
