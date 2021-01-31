package com.animals;

public class Talk {
    public static void main(String[] args) {
        Dog a = new Dog();

    System.out.format("%s can %s and has %d legs.", a.name(), a.talk(), a.numlegs());
    }
}
