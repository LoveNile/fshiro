package com.nile.fshiro.common.util;

import org.junit.Test;

import static org.junit.Assert.*;


public class Md5UtilsTest {

    @Test
    public void pwd() {
        System.out.println(Md5Utils.encrypt("123456"));
    }
}