package jsolutions.nelioalves.secao18.exemplo1.application;

import java.util.ArrayList;
import java.util.List;

import jsolutions.nelioalves.secao18.exemplo1.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.forEach(Product::staticPriceUpadate);

		list.forEach(System.out::println);

	}

}
