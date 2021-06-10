package com.example.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args){
        //menampilkan waktu sekarang
        Calendar cal = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + cal.getTime());

        //menampilakn waktu 15 hari yang lalu
        cal.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + cal.getTime());

        //menampilkan waktu 4 bulan yang akan datang
        cal.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + cal.getTime());

        //menamplkan waktu 2 tahun yang akan datang
        cal.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian: " + cal.getTime());
    }
}

/*
Waktu sekarang adalah Sat Jun 05 13:09:17 ICT 2021
15 hari yang lalu: Fri May 21 13:09:17 ICT 2021
4 bulan kemudian: Tue Sep 21 13:09:17 ICT 2021
2 tahun kemudian: Thu Sep 21 13:09:17 ICT 2023
 */