package com.example.javafundamental.exception;

public class Finally {
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            System.out.println("Akses ke elemen ke 5: " + a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}

/*
Exception thrown: java.lang.ArrayIndexOutOfBoundsException: 5 //5 = length of the array
Nilai elemen terakhir: 10
 */