package com.betulozgen.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    String username;


    @Override // üzerine yazmak. Daha önce oluşturulmuş bir metodun üstüne yazıyoruz.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("On Create Called");

        testMethod();

        System.out.println(math(8,9));
        System.out.println(newMethod("Betul"));

        makeMusicians();

        makeSimpsons();



    }


    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer",50 , "Nuclear");
        //homer.age = 51;
        //System.out.println(homer.age);
        System.out.println(homer.getName()); //ismi aldım.
        homer.setName("Homer Simpson");// ismi değiştirdim.
        System.out.println(homer.getName());// ismi tekrar aldım.
    }

    public void makeMusicians(){

        Musicians james = new Musicians("James","Guitar",50);
        System.out.printf(james.instrument);


    }


    public void testMethod(){
        int x = 4 + 4;
        System.out.println("value of x:" + x);

    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("On Resume Called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("On Start Called");
        testMethod();

    }

    public int math(int a, int b){
        return a + b;
    }

    public String newMethod(String string){

        return string + " new Method";


    }


    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("On Pause Called");
    }
}