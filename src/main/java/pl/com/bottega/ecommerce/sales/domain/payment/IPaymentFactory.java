package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Patryk Wierzyński
 */

public interface IPaymentFactory {

	Payment createPayment(ClientData clientData, Money amount);

}
