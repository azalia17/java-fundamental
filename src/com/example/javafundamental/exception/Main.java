package com.example.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String location ="D://namafile.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);
            //Jika berhasil ditampilkan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            //jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
/*
D:\namafile.txt (The system cannot find the file specified)
 */