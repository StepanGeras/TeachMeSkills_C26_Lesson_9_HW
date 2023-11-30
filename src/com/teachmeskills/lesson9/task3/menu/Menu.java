package com.teachmeskills.lesson9.task3.menu;

import com.teachmeskills.lesson9.task3.client.Client;
import com.teachmeskills.lesson9.task3.service.Check;
import com.teachmeskills.lesson9.task3.service.Limit;
import com.teachmeskills.lesson9.task3.service.TransferMoney;

import java.util.Scanner;

public class Menu {

    public static void DoMenu () {

        Scanner scanner = new Scanner(System.in);
        TransferMoney transferMoney = new TransferMoney();

        System.out.println("Select a card to transfer \n" +
                "1. Visa (Euro) \n" +
                "2. Master (Dollar) \n" +
                "3. Bel (Ruble) \n" +
                "4. Exit");
        int number = scanner.nextInt();

        switch (number){
            case 1:

                Check.CheckVisaCard();

                System.out.println("Which card should I transfer to? \n" +
                        "1. Master \n" +
                        "2. Bel \n" +
                        "3. Return");

                number = scanner.nextInt();

                switch (number){

                    case 1:
                        transferMoney.TransferMoneyVisaToMaster();
                        break;
                    case 2:
                        transferMoney.TransferMoneyVisaToBel();
                        break;
                    case 3:
                        DoMenu();
                    default:
                        break;

                }

                break;
            case 2:

                Check.CheckMasterCard();

                System.out.println("Which card should I transfer to? \n" +
                        "1. Visa \n" +
                        "2. Bel \n" +
                        "3. Return");

                number = scanner.nextInt();

                switch (number){

                    case 1:
                        transferMoney.TransferMoneyMasterToVisa();
                        break;
                    case 2:
                        transferMoney.TransferMoneyMasterToBel();
                        break;
                    case 3:
                        DoMenu();
                        break;
                    default:
                        break;

                }

                break;
            case 3:

                Check.CheckBelCard();

                System.out.println("Which card should I transfer to? \n" +
                        "1. Master \n" +
                        "2. Visa \n" +
                        "3. Return");

                number = scanner.nextInt();

                switch (number){

                    case 1:
                        transferMoney.TransferMoneyBelToMaster();
                        break;
                    case 2:
                        transferMoney.TransferMoneyBelToVisa();
                        break;
                    case 3:
                        DoMenu();
                        break;
                    default:
                        break;

                }

                break;

            default:
                return;

        }

    }

}
