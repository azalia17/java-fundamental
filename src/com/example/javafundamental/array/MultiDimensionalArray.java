package com.example.javafundamental.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';
        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

        // Akses indeks ke 4
        System.out.println(arrChar[4]);
    }
}

/*
 Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : A
Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : B
Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : C
Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : D
Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : E
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
at com.dicoding.javafundamental.array.MultiDimensionalArray.main(MultiDimensionalArray.java:25)
*/
