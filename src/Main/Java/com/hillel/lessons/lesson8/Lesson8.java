package com.hillel.lessons.lesson8;

public class Lesson8 {
    public static void main(String[] args) {

//        int[] array = {1, 5, -2, 99, 7, -7, 44, -55};
//        System.out.println(Arrays.toString(array));
//        int counter = 0;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//
//            }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("counter: " + counter);

//        Integer[] array = {1, 5, -2, 99, 7, -7, 44, -55};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(Arrays.binarySearch(array, 6));
//
//        int [][] array = new int[3][4];
//        array [0][0] = 77;
//        array [0][1] = 2;
//        array [0][2] = 5;
//        array [0][3] = 6;
//
//        array [1][0] = 5;
//        array [1][1] = 7;
//        array [1][2] = 9;
//        array [1][3] = 2;
//
//        array [2][0] = 11;
//        array [2][1] = 5;
//        array [2][2] = 3;
//        array [2][3] = 4;
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[] array1 = array[0];
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }

        int[][] array = {
                {77, 2, 5, 6},
                {5, 7, 9},
                {11, 5},
                {},
                {1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }



        //System.out.println(Arrays.deepToString(array));













    }
}
