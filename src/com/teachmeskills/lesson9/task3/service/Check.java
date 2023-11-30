package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.cards.cardsview.BelCard;
import com.teachmeskills.lesson9.task3.cards.cardsview.MasterCard;
import com.teachmeskills.lesson9.task3.cards.cardsview.VisaCard;

import java.util.Scanner;

public class Check {

    static Scanner scanner = new Scanner(System.in);
    public static void CheckBelCard () {

        BelCard belCard = new BelCard();

        System.out.print("Enter to id card ");
        int id = scanner.nextInt();

        if (id != belCard.getIdCard()) {
            for (int i = 2; i > 0; i--) {
                System.out.println("Wrong id \n" + i +" Attempts left");
                id = scanner.nextInt();
                if (id == belCard.getIdCard()) {
                    break;
                }
            }
            System.exit(0);
        }


    }

    public static void CheckVisaCard () {

        VisaCard visaCard = new VisaCard();

        System.out.print("Enter to id card ");
        int id = scanner.nextInt();

        if (id != visaCard.getIdCard()) {
            for (int i = 2; i > 0; i--) {
                System.out.println("Wrong id \n" + i +" Attempts left");
                id = scanner.nextInt();
                if (id == visaCard.getIdCard()) {
                    break;
                }
            }
            System.exit(0);
        }

    }

    public static void CheckMasterCard () {

        MasterCard masterCard = new MasterCard();

        System.out.print("Enter to id card ");
        int id = scanner.nextInt();

        if (id != masterCard.getIdCard()) {
            for (int i = 2; i > 0; i--) {
                System.out.println("Wrong id \n" + i +" Attempts left");
                id = scanner.nextInt();
                if (id == masterCard.getIdCard()) {
                    break;
                }
            }
            System.exit(0);
        }

    }

}
