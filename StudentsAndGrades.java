package com.ArrayAndObjectsHomeWork;

public class StudentsAndGrades {
    public static void main(String[] args) {

        String[][] names = {{"Alex", "Brian", "Costa", "Peter"},
                           {"A",       "C",    "F",     "B"},

        };

        for (int i = 0; i < names[0].length; i++) {

            if (names[1][i].equals("A") || names[1][i].equals("B")) {
                System.out.println(names[0][i]);
            }
        }





    }
}
