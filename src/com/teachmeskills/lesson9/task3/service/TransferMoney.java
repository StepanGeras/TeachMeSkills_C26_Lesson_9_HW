package com.teachmeskills.lesson9.task3.service;

import com.teachmeskills.lesson9.task3.cards.cardsview.BelCard;
import com.teachmeskills.lesson9.task3.cards.cardsview.MasterCard;
import com.teachmeskills.lesson9.task3.cards.cardsview.VisaCard;
import com.teachmeskills.lesson9.task3.client.Client;

public class TransferMoney {

    BelCard belCard = new BelCard();
    MasterCard masterCard = new MasterCard();
    VisaCard visaCard = new VisaCard();
    Client client = new Client();
    double sum;
    double transfer;
    double residue;

    public void TransferMoneyBelToMaster () {

        sum = belCard.getSum();

        residue = Transfer.DoTransfer(belCard.getSum());
        transfer = Conversion.ConversionCardRubleToDollar (residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer on Belcard " + sum);
        System.out.println("Amount of money before transfer on Mastercard " + masterCard.getSum());

        belCard.setSum(sum - Commission.CommissionBelCard(residue) - residue);
        masterCard.setSum(masterCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Belcard " + belCard.getSum());
        System.out.println("Amount of money after transfer to Mastercard " + masterCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionBelCard(residue));

    }

    public void TransferMoneyBelToVisa () {

        sum = belCard.getSum();

        residue = Transfer.DoTransfer(belCard.getSum());
        transfer = Conversion.ConversionCardRubleToEuro (residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer on Belcard " + sum);
        System.out.println("Amount of money before transfer to Visacard " + masterCard.getSum());

        belCard.setSum(sum - Commission.CommissionBelCard(residue) - residue);
        visaCard.setSum(visaCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Belcard " + belCard.getSum());
        System.out.println("Amount of money after transfer to Visacard " + visaCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionBelCard(residue));

    }

    public void TransferMoneyMasterToBel () {

        sum = masterCard.getSum();

        residue = Transfer.DoTransfer(masterCard.getSum());
        transfer = Conversion.ConversionCardDollarToRuble(residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer on Mastercard " + sum);
        System.out.println("Amount of money before transfer on Belcard " + belCard.getSum());

        masterCard.setSum(sum - Commission.CommissionMasterCard(residue) - residue);
        visaCard.setSum(belCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Mastercard " + masterCard.getSum());
        System.out.println("Amount of money after transfer to Belcard " + belCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionMasterCard(residue));

    }

    public void TransferMoneyMasterToVisa () {

        sum = masterCard.getSum();

        residue = Transfer.DoTransfer(masterCard.getSum());
        transfer = Conversion.ConversionCardDollarToEuro (residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer on Mastercard " + sum);
        System.out.println("Amount of money before transfer to Visacard " + visaCard.getSum());

        masterCard.setSum(sum - Commission.CommissionMasterCard(residue) - residue);
        visaCard.setSum(visaCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Mastercard " + masterCard.getSum());
        System.out.println("Amount of money after transfer to Visacard " + visaCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionMasterCard(residue));

    }

    public void TransferMoneyVisaToMaster () {

        sum = visaCard.getSum();

        residue = Transfer.DoTransfer(visaCard.getSum());
        transfer = Conversion.ConversionCardEuroToDollar(residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer to Visacard " + sum);
        System.out.println("Amount of money before transfer on Mastercard " + masterCard.getSum());

        visaCard.setSum(sum - Commission.CommissionVisaCard(residue) - residue);
        masterCard.setSum(masterCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Visacard " + visaCard.getSum());
        System.out.println("Amount of money after transfer to Mastercard " + masterCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionVisaCard(residue));

    }

    public void TransferMoneyVisaToBel () {

        sum = visaCard.getSum();

        residue = Transfer.DoTransfer(masterCard.getSum());
        transfer = Conversion.ConversionCardEuroToRuble(residue);

        System.out.println(client.getName() + " " + client.getSurname());
        System.out.println("Amount of money before transfer to Visacard " + sum);
        System.out.println("Amount of money before transfer on Belcard " + belCard.getSum());

        visaCard.setSum(sum - Commission.CommissionVisaCard(residue) - residue);
        belCard.setSum(belCard.getSum() + transfer);

        System.out.println("Amount of money after transfer to Visacard " + visaCard.getSum());
        System.out.println("Amount of money after transfer to Belcard " + belCard.getSum());
        System.out.println("The transfer fee " + Commission.CommissionVisaCard(residue));

    }

}
