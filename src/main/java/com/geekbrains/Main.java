package com.geekbrains;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lada",2101,"red");
        String carToJSON = new Gson().toJson(car);

        System.out.println(carToJSON);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Car car2 = gson.fromJson(carToJSON,Car.class);

        System.out.println(car);
        System.out.println(car2);
    }
}
