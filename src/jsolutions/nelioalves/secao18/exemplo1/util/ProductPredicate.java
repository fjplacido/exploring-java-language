package jsolutions.nelioalves.secao18.exemplo1.util;

import java.util.function.Predicate;

import jsolutions.nelioalves.secao18.exemplo1.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 900.00;
	}

}
