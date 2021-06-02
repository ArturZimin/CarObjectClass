package com.company;

public class Car {
    public String model;
    public int year;
    public String color;
    public int engineVolume;
    public int maxSpeed;
    public int speed;
    public String[] array;

    public int ridesOrStands(int speed) {
        if (speed >= 1) {
            System.out.println(" car rides");

        } else {
            System.out.println("car stands still");
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
            System.out.println("The car is maximum speed" + maxSpeed);

        }
        return speed;
    }


    public void Car() {
    }//конструктор по умолчанию

    public String getModel(String model) {//получать
        return model;
    }

    public Car(String model, String color, int year, int engineVolume, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;

    }

    public Car(int speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public void systemOut(Car model) {

        System.out.println(model + color + maxSpeed + engineVolume);

    }

    public void setArray(String[] array) {
        this.array = array;
    }


    public String[] getArray() {
        return array;
    }
}



