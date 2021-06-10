package com.example.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");
        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------");
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));


        System.out.println("------------------------");
        Object o = new Kucing(); // kucing adalah Object
        Hewan h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing, pastinya :)

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k; // bisa langsung diassign
        Hewan hewanK= k; // bisa langsung diassign

        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}

/*
construct Hewan
Apakah hewan IS-A Objek -> true
Apakah hewan IS-A Hewan -> true
Apakah hewan IS-A Kucing -> false
------------------------
construct Hewan
construct Kucing
Apakah hewan IS-A Objek -> true
Apakah kucing IS-A Hewan -> true
Apakah kucing IS-A Kucing -> true
------------------------
Hewan sedang makan..
Kucing sedang makan..
Kucing makan daging ikan
------------------------
construct Hewan
construct Hewan
construct Hewan
Kucing ras: Ocicat, habitat: tropis
Kucing ras: Ocicat, habitat: subtropis
Kucing ras: Anggora, habitat: subtropis
meow equals puss ? true
meow equals popo ? false
------------------------
construct Hewan
construct Kucing
construct Hewan
construct Kucing
construct Hewan
construct Kucing
Kucing sedang makan..
Kucing sedang makan..
Kucing sedang makan..
Kucing sedang makan..
construct Hewan
Exception in thread "main" java.lang.ClassCastException: class com.dicoding.javafundamental.inheritance.Hewan cannot be cast to class com.dicoding.javafundamental.inheritance.Kucing (com.dicoding.javafundamental.inheritance.Hewan and com.dicoding.javafundamental.inheritance.Kucing are in unnamed module of loader 'app')
at com.dicoding.javafundamental.inheritance.Main.main(Main.java:56)
*/