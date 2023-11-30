package com.teachmeskills.lesson9.task3.service;

import java.util.Scanner;

public class Transfer {

    public static double DoTransfer (double money) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much money to transfer");
        double takeOff = scanner.nextInt();

        return NotMoney.DoNotMoney(money, Limit.LimitCard(takeOff));

    }

}
