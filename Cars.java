package com.ArrayAndObjectsHomeWork;

import java.util.Arrays;

public class Cars {
    public static void main(String[] args) {

        String[][] cars = {{"American", "Ford", "Chevrolet"},
                           {"German", "Mercedes", "BMW"},
                           {"Korean", "Hyundai", "Kia"},
                           {"Italian", "Ferrari", "Lamborghini"}

        };

        for (String[] car : cars) {
            System.out.println(Arrays.toString(car));
        }

        System.out.println("*************************************");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(Arrays.toString(cars[i]));
        }





    }
}
