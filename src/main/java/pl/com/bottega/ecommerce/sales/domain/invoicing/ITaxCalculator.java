package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Patryk Wierzyński
 */

public interface ITaxCalculator {

	Tax calculateTax(ProductType productType, Money net);

}
