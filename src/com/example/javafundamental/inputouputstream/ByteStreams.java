package com.example.javafundamental.inputouputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("latihan_input.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (in != null){
                    in.close();
                }if (out != null){
                    out.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

/*
java.io.FileNotFoundException: latihan_input.txt (The system cannot find the file specified)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.io.FileInputStream.<init>(FileInputStream.java:93)
	at com.example.javafundamental.inputouputstream.ByteStreams.main(ByteStreams.java:13)
 */