package jsolutions.nelioalves.secao18.exemplo1.util;

import java.util.function.Consumer;

import jsolutions.nelioalves.secao18.exemplo1.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
