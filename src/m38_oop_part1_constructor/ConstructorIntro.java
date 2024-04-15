package m38_oop_part1_constructor;

import javax.sound.midi.Soundbank;

public class ConstructorIntro {

    public ConstructorIntro() {//NO-ARG CONSTRUCTOR

        System.out.println("The object is created by using no-arg constructor.");
    }

    public ConstructorIntro(int a) {//PARAMETERIZED CONSTRUCTOR

        System.out.println("The object is created by using parameterized constructor.");
    }

    public static void main(String[] args) {

        ConstructorIntro obj = new ConstructorIntro();

        //ConstructorIntro obj2 = new ConstructorIntro(10);
    }
}
