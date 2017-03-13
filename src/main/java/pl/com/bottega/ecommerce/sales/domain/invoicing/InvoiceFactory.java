package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 * Created by Wojciech Szczepaniak on 13.03.2017.
 */
public class InvoiceFactory {

    public Invoice create(ClientData client) {
        return Invoice.generate(Id.generate(), client);
    }
}
