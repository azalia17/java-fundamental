package com.example.javafundamental.inputouput;
import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}

/*
Program penjumlahan sangat sederhana
Masukan Angka pertama : 10 ~input by user
Masukan Angka kedua : 5 ~input by user
Hasilnya adalah : 15
 */