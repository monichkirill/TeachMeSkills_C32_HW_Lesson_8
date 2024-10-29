import document_parser.IParser;
import fabric.ParserFabric;
import model.account.Account;
import model.card.MasterCard;
import model.card.VisaCard;
import transfer.impl.MasterCardTransferService;
import transfer.impl.VisaCardTransferService;

import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Input path to file");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        IParser parser = ParserFabric.createParser(input);
        parser.parseFile(input);

        Account account1 = new Account();
        Account account2 = new Account();

        MasterCard masterCardAccount1 = new MasterCard("123123", 234, new Date(), "Vlad Fomin", "RUB", "RUS");
        VisaCard visaCardAccount1 = new VisaCard("321321", 123, new Date(), "Vlad Fomin", "RUB", 5);

        MasterCard masterCardAccount2 = new MasterCard("456456", 645, new Date(), "Nikita Krutoy", "BYN", "BLR");
        VisaCard visaCardAccount2 = new VisaCard("654654", 446, new Date(), "Nikita Krutoy", "BYN", 1);

        MasterCardTransferService transfer1 = new MasterCardTransferService();
        transfer1.transferFromCardToCard(masterCardAccount1, visaCardAccount2, 500);
        VisaCardTransferService transfer2 = new VisaCardTransferService();
        transfer2.transferFromCardToAccount(masterCardAccount2, visaCardAccount1, 500);

        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клинента на счет другого клиента сумму денег
    }
}
