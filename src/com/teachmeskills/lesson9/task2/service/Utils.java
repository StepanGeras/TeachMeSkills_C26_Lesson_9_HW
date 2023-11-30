package com.teachmeskills.lesson9.task2.service;

import java.util.Arrays;

public class Utils {

    public static void ArraysDisplay (int [][] array1, int [][] array2) {

        int [][] productOfMatrices = new int [array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array2[0].length; k++) {
                    productOfMatrices[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(productOfMatrices));

    }

}
