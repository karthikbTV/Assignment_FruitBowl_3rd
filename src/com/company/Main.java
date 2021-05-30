package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fruit fruitBowl = new Fruit("Apple","Banana","Orange", 30,40,50);


        System.out.format("Segragating "+ fruitBowl.getSecondFruit()+ " fruit of number - "+
                fruitBowl.getSecondFruitCount()+ "%n");
        System.out.format("Segragating "+ fruitBowl.getFirstFruit()+ " fruit of number - "+
                fruitBowl.getFirstFruitCount()+ "%n");
        System.out.format("Segragating "+ fruitBowl.getThirdFruit()+ " fruit of number - "+
                fruitBowl.getThirdFruitCount() +"%n");


    }
}
