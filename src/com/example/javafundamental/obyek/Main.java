package com.example.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {

        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}

/*
Nama hewan : Elang
Berat hewan : 5 kg
Jumlah kaki: 2
Nama hewan : Kucing
Berat hewan : 2 kg
Jumlah kaki: 4
*/