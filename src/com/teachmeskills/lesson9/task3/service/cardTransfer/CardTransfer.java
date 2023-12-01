package com.teachmeskills.lesson9.task3.service.cardTransfer;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.model.client.Client;
import com.teachmeskills.lesson9.task3.service.checkId.CheckId;
import com.teachmeskills.lesson9.task3.service.commission.Commission;
import com.teachmeskills.lesson9.task3.service.conversion.CurrencyCheck;
import com.teachmeskills.lesson9.task3.service.limit.LimitCard;
import com.teachmeskills.lesson9.task3.service.moneyCheck.MoneyCheck;

import java.util.Scanner;

public class CardTransfer {

        public static void Transfer (BaseCard cardFrom, BaseCard cardTo) {

            Client client = new Client("Alex", "Gofri");
            Scanner scanner = new Scanner(System.in);
            CheckId.doCheckId(cardFrom);
            System.out.println("Enter the amount to transfer");
            int sum = scanner.nextInt();

            while (MoneyCheck.doMoneyCheck(cardFrom, sum)){
                System.out.println("Insufficient funds \n" + "Enter a different transfer amount");
                sum = scanner.nextInt();
                MoneyCheck.doMoneyCheck(cardFrom, sum);
            }

            while (LimitCard.LimitCheck(cardFrom, sum)){
                System.out.println("Transfer limit exceeded \n" + "Enter a different transfer amount");
                sum = scanner.nextInt();
                LimitCard.LimitCheck(cardFrom, sum);
            }

            System.out.println(client.getName() + " " + client.getSurname());

            System.out.println("Card From. Before transfer: " + cardFrom.getNumberCard() + "->" + cardFrom.getSum());
            System.out.println("Card To. Before transfer: " + cardTo.getNumberCard() + "->" + cardTo.getSum());

            double balanceCardFrom = cardFrom.getSum() - sum - Commission.doCommission(cardFrom, sum);
            cardFrom.setSum(balanceCardFrom);

            double balanceCardTo = cardTo.getSum() + CurrencyCheck.doCurrencyCheck(cardTo, cardFrom, sum);
            cardTo.setSum(balanceCardTo);

            System.out.println("Card From. After transfer: " + cardFrom.getNumberCard() + "->" + cardFrom.getSum());
            System.out.println("Card To. After transfer: " + cardTo.getNumberCard() + "->" + cardTo.getSum());
            System.out.println("Commission " + Commission.doCommission(cardFrom, sum));

        }

}
