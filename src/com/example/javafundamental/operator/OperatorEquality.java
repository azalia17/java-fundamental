package com.example.javafundamental.operator;

public class OperatorEquality {

    public static void main(String[] args) {

        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah " + result);
        System.out.println();
    }
}

/*
Hasil 'value == anotherValue' adalah false

Tidak sama dengan..
Hasil 'value != anotherValue' adalah true

Lebih besar dari..
Hasil 'value > anotherValue' adalah true

Sama atau lebih besar dari..
Hasil 'value >= anotherValue' adalah true

Kurang dari..
Hasil 'value < anotherValue' adalah false

Sama atau kurang dari dengan..
Hasil 'value <= anotherValue' adalah false
 */
