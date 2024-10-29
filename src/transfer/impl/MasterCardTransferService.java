package transfer.impl;

import model.card.BaseCard;
import model.document.Check;
import transfer.CardTransferService;

import java.util.Date;

public class MasterCardTransferService implements CardTransferService {
    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardFrom);
        }
        return null;
    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer)) {
            return new Check(sumOfTransfer, new Date(), cardTo);
        }
        return null;
    }
}
