import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> listProducts = new ArrayList<Product>();
		
		System.out.print("Enter num of products: ");
		Integer numProducts = sc.nextInt();
		
		for(int i=1;i <= numProducts; i++) {
			System.out.println("Common, used or imported (c/u/i)? ");
			char condicion = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(condicion == 'u') {
				System.out.println("Manufacture date: ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), dtFormatter);
				Product product = new UsedProduct(name, price, manufactureDate);
				listProducts.add(product);
			}else if(condicion == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				listProducts.add(product);
			}else {
				Product product = new Product(name, price);
				listProducts.add(product);
			}
		}
		
		System.out.println("PRICE TAGS:");
		
		listProducts.stream().forEach((x)->{
			System.out.println(x.priceTag());
		});
		
	}

}
