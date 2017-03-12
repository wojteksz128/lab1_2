package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Patryk Wierzyński
 */

public class InvoiceFactory implements IInvoiceFactory {


	public Invoice createInvoice(ClientData clientData) {
		return new Invoice(Id.generate(), clientData);
	}

	public InvoiceLine createInvoiceLine(RequestItem requestItem, Money net, Tax tax) {
		return new InvoiceLine(requestItem.getProductData(),
				requestItem.getQuantity(), net, tax);
	}
}
