package com.betulozgen.methodsandclasses;


//public : her yerden erişebilirsin. HALKA AÇIK
//Private: Her yerden erişemezsin. ÖZEL
//protected: Korumalı, Private ile aynı ama bazı sınıflar diğerini extend ederse kullanabilir.
//protected: Private ile public arasında. Sınıfın dışından görülmez! Ancak sınıftan türeyen sınıflar bunu kullanabilir.

//ORN:
//Ailenin ----> arabası saklanmaz.---> PUBLIC.
//Ailenin ----> 1. dereceden üyelerinin bilip, dışardakilerin bilmediği ----> PROTECTED.
//Ailenin ----> eşler arasınadki özel hayat ---> PRIVATE.
public class Simpsons {


    private String name;
    private int age;
    private String job;

    //Constructor
    public Simpsons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //Getter and Setter
    //SET: Nesnenin özelliklerine değer atandığında çalışır.
    //GET: Özellik değeri okunduğunda ya da farklı bir ifadeye aktarılmaya çalışıldığında çalışır.
    //AMAÇ:
    // A Classındaki private erişim tipi olan değişkene B Classından erişebilmek için kullanılır.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
