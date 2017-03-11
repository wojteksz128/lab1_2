package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * Created by Piotr on 11.03.2017.
 */
public class InvoiceFactory {

    public Invoice createInvoice(ClientData client) {
        return new Invoice(Id.generate(),client);
    }
}
