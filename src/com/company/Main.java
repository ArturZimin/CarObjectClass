package com.company;

public class Main {

    public static void main(String[] args) {


        Car audi = new Car("a6", "white", 2020, 2000, 190);
        Car bmw = new Car("X5", "blu", 2019, 3000, 220);
        Car ford = new Car("Galaxy", "black", 2018, 1900, 170);
        Car mercedesBenz = new Car("s220", "red", 2017, 2600, 210);

        Car[] car = new Car[4];
        car[0] = audi;
        car[1] = bmw;
        car[2] = ford;
        car[3] = mercedesBenz;

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);


        }



    }
}
