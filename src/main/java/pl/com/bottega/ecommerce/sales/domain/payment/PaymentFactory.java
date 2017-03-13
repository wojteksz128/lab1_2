package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Wojciech Szczepaniak on 13.03.2017.
 */
public class PaymentFactory {

    public Payment createPayment(Id aggregateId, ClientData clientData, Money amount) {
        return Payment.generate(aggregateId, clientData, amount);
    }
}
