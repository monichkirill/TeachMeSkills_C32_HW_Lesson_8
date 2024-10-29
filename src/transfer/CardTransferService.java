package transfer;

import model.card.BaseCard;
import model.document.Check;

public interface CardTransferService {
    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

    Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);
}
