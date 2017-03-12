package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Patryk Wierzyński
 */

public interface IInvoiceFactory {

	Invoice createInvoice(ClientData clientData);
	InvoiceLine createInvoiceLine(RequestItem requestItem, Money net, Tax tax);

}
