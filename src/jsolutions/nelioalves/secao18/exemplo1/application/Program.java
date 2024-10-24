package jsolutions.nelioalves.secao18.exemplo1.application;

import java.util.ArrayList;
import java.util.List;

import jsolutions.nelioalves.secao18.exemplo1.entities.Product;
import jsolutions.nelioalves.secao18.exemplo1.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.removeIf(new ProductPredicate());

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
