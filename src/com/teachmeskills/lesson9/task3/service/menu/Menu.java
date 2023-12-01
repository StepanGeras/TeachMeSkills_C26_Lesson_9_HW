package com.teachmeskills.lesson9.task3.service.menu;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.model.card.impl.BelCard;
import com.teachmeskills.lesson9.task3.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.task3.model.card.impl.VisaCard;
import com.teachmeskills.lesson9.task3.service.cardTransfer.CardTransfer;

import java.util.Scanner;

public class Menu {

    public static void doMenu () {

        Scanner scanner = new Scanner(System.in);

        BaseCard belCard = new BelCard("789", 1500, 999, 135, 1000, 0.015, 933);
        BaseCard visaCard = new VisaCard("456", 700, 888, 531, 2000, 0.02, 978);
        BaseCard masterCard = new MasterCard("123", 700, 777, 246, 1500, 0.01, 840);

        System.out.println("""
                Select a card to transfer\s
                1. Visa (Euro)\s
                2. Master (Dollar)\s
                3. Bel (Ruble)\s
                4. Exit""");

        int count = scanner.nextInt();

        switch (count) {
            case 1:

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Master\s
                        2. Bel\s
                        3. Return""");

                count = scanner.nextInt();

                switch (count) {
                    case 1:
                        CardTransfer.Transfer(visaCard, masterCard);
                        break;
                    case 2:
                        CardTransfer.Transfer(visaCard, belCard);
                        break;
                    default:
                        Menu.doMenu();
                        break;
                }

                break;

            case 2:

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Visa\s
                        2. Bel\s
                        3. Return""");

                count = scanner.nextInt();

                switch (count) {
                    case 1:
                        CardTransfer.Transfer(masterCard, visaCard);
                        break;
                    case 2:
                        CardTransfer.Transfer(masterCard, belCard);
                        break;
                    default:
                        Menu.doMenu();
                        break;
                }

                break;

            case 3:

                System.out.println("""
                        Which card should I transfer to?\s
                        1. Master\s
                        2. Visa\s
                        3. Return""");

                count = scanner.nextInt();

                switch (count) {
                    case 1:
                        CardTransfer.Transfer(belCard, masterCard);
                        break;
                    case 2:
                        CardTransfer.Transfer(belCard, visaCard);
                        break;
                    default:
                        Menu.doMenu();
                        break;
                }

            default:
                System.exit(0);

        }

    }

}
