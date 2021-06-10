package com.example.javafundamental.operator;

public class OperatorUnary {

    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();

/*
        int a = 5;
        int b = 1;
        System.out.println(++a);
        System.out.println(b++);

        String Dicoding = "Dicoding Indonesia";
        int length = Dicoding.length();
        System.out.println(length);

        for (int x = 0; x < 5; x++) {
            if ((x % 2) != 0) {
                System.out.print(x);
            }
        }
*/
    }
}

/*
Operator Unary Plus
Hasil +5 = 5

Operator Unary Minus
Hasil -5 = -5

Operator peningkatan nilai sebesar 1 point
Hasil 5++ = 6

Operator pengurangan nilai sebesar 1 point
Hasil 5-- = 4

Operator komplemen logika
Hasil !false = true

 */