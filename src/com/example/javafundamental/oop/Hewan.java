package com.example.javafundamental.oop;

public interface Hewan {

    String RESPIRASI = "oksigen";
    void makan();
/*
    modifier public, static, and final is redundant in interfae class
    public static final String respirasi = "oksigen";
    public void makan();

*/
/*
    Interface abstract method cannot have body
    public void makan() {
        System.out.println("Memakan daging, tumbuhan, atau segalanya.");
    }
*/
}
