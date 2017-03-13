package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Wojciech Szczepaniak on 13.03.2017.
 */
public interface TaxPolicy {

    public Tax calculateTax(ProductData productData, Money net);
}
