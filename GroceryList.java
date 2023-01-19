package com.ArrayAndObjectsHomeWork;

import java.util.Arrays;

public class GroceryList {
    public static void main(String[] args) {

        String[][] groceryList = {{"Veggies", "Carrots", "Spinach", "Cabbage"},
                                  {"Fruits", "Apples", "Bananas", "Oranges"},
                                  {"Dairy", "Milk", "Cheese", "Yogurt"},
                                  {"Sweets", "Chocolate", "Cake", "Ice Cream"}
        };

        for (String[] one : groceryList) {
            System.out.println(Arrays.toString(one));
        }

        System.out.println("*************************************");

        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(Arrays.toString(groceryList[i]));
        }





    }
}
