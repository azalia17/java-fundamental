package com.example.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0 ; x < 5; x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);
    }
}

/*
Nilainya adalah 0
Sampai 5
Getnilai memiliki nilai 5
*/