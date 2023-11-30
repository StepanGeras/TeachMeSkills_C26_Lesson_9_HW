package com.teachmeskills.lesson9.task3.menu;

import com.teachmeskills.lesson9.task3.service.Check;
import com.teachmeskills.lesson9.task3.service.TransferMoney;

import java.util.Scanner;

public class Menu {

    public static int DoMenu () {

        Scanner scanner = new Scanner(System.in);
        TransferMoney transferMoney = new TransferMoney();

        System.out.println("""
                Select a card to transfer\s
                1. Visa (Euro)\s
                2. Master (Dollar)\s
                3. Bel (Ruble)\s
                4. Exit""");
        int number = scanner.nextInt();

        switch (number){
            case 1:

                Check.CheckVisaCard();

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Master\s
                        2. Bel\s
                        3. Return""");

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

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Visa\s
                        2. Bel\s
                        3. Return""");

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

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Master\s
                        2. Visa\s
                        3. Return""");

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
                return 0;

        }

        return 0;

    }

}
