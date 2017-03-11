package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Piotr on 11.03.2017.
 */
public class PaymentFactory {

    public Payment createPayment(ClientData clientData, Money amount) {
        return new Payment(Id.generate(), clientData, amount);
    }
}
