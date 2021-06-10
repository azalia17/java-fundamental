package com.example.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args) {
/* Cara SUsah
        int[] arrInt = new int[]{1, 2, 3, 4, 5, ..., 999998, 999999, 1000000};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);

        ...

        System.out.println(arrInt[999998]);
        System.out.println(arrInt[999999]);
*/
        int[] arrInt = new int[1000000];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}

/*
1
...
1000000
 */