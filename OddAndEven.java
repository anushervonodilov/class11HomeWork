package com.ArrayAndObjectsHomeWork;

public class OddAndEven {
    public static void main(String[] args) {

        int[][] nums = {{10, 20, 30, 77},
                        {40, 50, 60, 19},
                        {70, 80, 90, 11}
        };

        for (int[] num : nums) {
            for (int even : num) {
                if (even % 2 == 0) {
                    System.out.print(even + " ");
                }
            }
        }





    }
}
