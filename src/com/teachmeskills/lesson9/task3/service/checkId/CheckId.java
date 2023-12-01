package com.teachmeskills.lesson9.task3.service.checkId;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

import java.util.Scanner;

public class CheckId {

    public static void doCheckId (BaseCard cardFrom) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to id card ");
        int id = scanner.nextInt();

        if (id != cardFrom.getIdCard()) {
            for (int i = 2; i > 0; i--) {
                System.out.println("Wrong id \n" + i +" Attempts left");
                id = scanner.nextInt();
                if (id == cardFrom.getIdCard()) {
                    return;
                }
            }
            System.exit(0);
        }

    }

}
