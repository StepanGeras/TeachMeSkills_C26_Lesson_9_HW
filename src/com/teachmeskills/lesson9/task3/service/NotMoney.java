package com.teachmeskills.lesson9.task3.service;

import java.util.Scanner;

public class NotMoney {

    public static double DoNotMoney(double money, double transfer) {

        Scanner scanner = new Scanner(System.in);

        while (transfer >= money) {

            System.out.println("Недостаточно средств \n" +
                    "Введите другую сумму");
            transfer = scanner.nextDouble();

        }

        return transfer;

    }

}
