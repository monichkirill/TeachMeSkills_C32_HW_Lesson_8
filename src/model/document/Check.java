package model.document;

import model.card.BaseCard;

import java.util.Date;

public class Check {
    private double transferSum;
    private Date dateOfTransfer;
    private String accountNumber;

    public Check(double transferSum, Date dateOfTransfer, BaseCard account) {
        this.transferSum = transferSum;
        this.dateOfTransfer = dateOfTransfer;
        this.accountNumber = account.cardNumber;
    }

    public void getCheckInfo() {
        System.out.println("Check{" +
                "transferSum=" + transferSum +
                ", dateOfTransfer=" + dateOfTransfer +
                ", accountNumber='" + accountNumber + '\'' +
                '}');
    }
}
