package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Piotr on 11.03.2017.
 */
public interface TaxCalculations {
    public Tax calculateTax(ProductType productType, Money money);

}
