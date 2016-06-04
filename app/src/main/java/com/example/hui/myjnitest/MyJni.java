package com.example.hui.myjnitest;

public class MyJni {

    static {
        System.loadLibrary("myjni");
    }

    public native int add(int a, int b);
}
