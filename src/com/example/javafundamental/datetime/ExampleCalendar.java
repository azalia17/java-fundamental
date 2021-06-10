package com.example.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args){
        //menampilkan waktu sekarang
        Calendar calendar =  Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " +calendar.getTime());
    }
}

/*
Waktu sekarang adalah Sat Jun 05 12:54:32 ICT 2021
 */