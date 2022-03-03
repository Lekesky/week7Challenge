package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Engine engine1 = new Engine("Hemi - nuclear V8");
        System.out.println(engine1);

        Tire tire1 = new Tire(31,"Michelin");
        Tire tire2 = new Tire(32,"Michelin");
        Tire tire3 = new Tire(40,"Michelin");
        Tire tire4 = new Tire(32,"Michelin");

        List<Tire> listOfTires = new ArrayList<>();
        Collections.addAll(listOfTires, tire1, tire2, tire3, tire4);

        //build car!
        Car newCar = new Car("Vette", engine1, listOfTires);
        System.out.println(newCar);

    }
}
