package com.ArrayAndObjectsHomeWork;

public class SumOfNumbers {
    public static void main(String[] args) {

        int[][] nums = {{10, 20, 30},
                        {40, 50, 60},
                        {70, 80, 90}
        };

        int sum = 0;

        for (int[] num : nums) {
            for (int row : num) {
                sum += row;
            }
        }
        System.out.println("The sum of numbers is " + sum);





    }
}
