package com.betulozgen.methodsandclasses;

public class Musicians {

    //attribute
    String name;
    String instrument;
    int age;


    //Constructor -- instance oluşturulduğunda çağrılacak ilk method.
    //Instance -- objenin birebir aynı özelliğine sahip bir çok örnekleri oluşturulmuş olur.
    //ÖRN: Obje masa olsun. Instancelerin: yemek masası,toplantı masası vb.

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;

        System.out.println( "Constructor called!");
    }
}
