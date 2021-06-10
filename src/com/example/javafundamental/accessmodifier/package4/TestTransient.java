package com.example.javafundamental.accessmodifier.package4;

import java.io.Serializable;

class TestTransient implements Serializable {

    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;

}