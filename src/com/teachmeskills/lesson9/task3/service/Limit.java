package com.teachmeskills.lesson9.task3.service;

import java.util.Scanner;

public class Limit {

    public static double LimitCard (double sum) {

        Scanner scanner = new Scanner(System.in);

        int minLimit = 5;
        int maxLimit = 3000;

        while (sum <= minLimit || sum >= maxLimit) {

            System.out.println("Minimum amount for transfer 5 \n" + "Maximum amount for transfer 3000");
            sum = scanner.nextDouble();

        }

        return sum;

    }

}
