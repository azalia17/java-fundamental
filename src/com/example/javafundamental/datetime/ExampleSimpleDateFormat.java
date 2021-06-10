package com.example.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default: " + new Date());
        System.out.println("Format tanggal dengan formate: " +dateFormated);
    }
}

/*
Format tanggal default: Sat Jun 05 14:14:44 ICT 2021
Format tanggal dengan formate: 05/6/2021
 */