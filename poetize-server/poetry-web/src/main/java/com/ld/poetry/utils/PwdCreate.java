package com.ld.poetry.utils;

import org.springframework.util.DigestUtils;

public class PwdCreate {
    public static void main(String[] args) {
        String s = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println(s);
    }
}
