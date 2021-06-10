package com.example.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args){
        //menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " +calendar.getTime());

        //menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal: " + calendar.get(Calendar.DATE));
        System.out.println("Bulan: " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun: " + calendar.get(Calendar.YEAR));
    }
}

/*
Waktu sekarang adalah Sat Jun 05 13:04:56 ICT 2021
Tanggal: 5
Bulan: 5
Tahun: 2021
 */