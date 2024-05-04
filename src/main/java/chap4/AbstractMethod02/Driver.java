package chap4.AbstractMethod02;

import chap4.AbstractMethod01.Animal;

public class Driver {
    public static void main(String[] args){
        chap4.AbstractMethod01.Animal[] animals = new Animal[2];

        animals[0] = new Dog();
        animals[1] =  new Cat();

        for (int i = 0; i < animals.length ; i++) {
            animals[i].aaa();
        }

        // Animal animal1 = new Animal();
    }
}
