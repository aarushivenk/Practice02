package com.sample;

public class Test {

    public static void main(String[] args) {
//        System.out.println("hello world");
        Test h = new Test();
        h.sayHello(args[0]+ " " + args[1]);
    }

    public void sayHello(String msg) {
        System.out.println(msg);
    }
}
