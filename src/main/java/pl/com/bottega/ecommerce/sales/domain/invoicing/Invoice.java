/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.sharedkernel.Money;


public class Invoice  {

	private ClientData client;
	private Money net = Money.ZERO;
	private Money gros = Money.ZERO;
	private List<InvoiceLine> items = new ArrayList<InvoiceLine>();
	private Id id;
	

	public void addItem(InvoiceLine item) {
		items.add(item);

		net = net.add(item.getNet());
		gros = gros.add(item.getGros());
	}

	static Invoice generate(Id invoiceId, ClientData client) {
	    Invoice invoice = new Invoice();
	    invoice.id = invoiceId;
	    invoice.client = client;
		return invoice;
	}

	/**
	 * 
	 * @return immutable projection
	 */
	public List<InvoiceLine> getItems() {
		return Collections.unmodifiableList(items);
	}

	public ClientData getClient() {
		return client;
	}

	public Money getNet() {
		return net;
	}

	public Money getGros() {
		return gros;
	}

}
