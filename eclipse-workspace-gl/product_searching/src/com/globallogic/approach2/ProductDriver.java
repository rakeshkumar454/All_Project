package com.globallogic.approach2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductDriver {
	static Scanner sc = new Scanner(System.in);
	static boolean found = false;
	static List<Product> list = Arrays.asList(new Product(1, "Table", 900.00, 102), new Product(2, "Chair", 1500.00, 10),
			new Product(3, "Glass", 999.00, 101), new Product(4, "Fan", 2500.00, 110));

	public static void main(String[] args) {

		boolean quit = true;
		while (quit) {
			System.out.println("1.Search by name \n2.Search by Price\n3.Search by availability quantity\n4.To Exit");
			System.out.println("Select the operation you need to perform: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the name you want to search: ");
				String name = scan.nextLine();
				boolean found = searchingByName(name);
				if (found == false)
				break;

			case 2:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter the price you want to search: ");
				double price = scan1.nextDouble();
				boolean foundprice = searchingByPrice(price);
				if (foundprice == false)
					
				break;
			case 3:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter the quantity you want to search: ");
				int quantity = scan2.nextInt();
				boolean available = searchingByAvailabilityQuantity(quantity);
				if (available == false)
					System.out.println("No products found for the quantity: " + quantity);
				break;

			case 4:
				quit = false;
				System.exit(input);
			default:
				System.out.println("Please select the correct operation to perform");
			}
		}

	}

	private static boolean searchingByName(String name) {
		for (Product product : list) {
			if (!(product.getProduct_name().equalsIgnoreCase(name))) {
				found = false;
				System.out.println("No products available for the price " );
//				continue;
			} else
				System.out.println("Product found: " + product);
			found = true;
		}
		return found;

	}

	private static boolean searchingByPrice(Double price) {
		for (Product product : list) {
			if (!(product.getPrice() == price)) {
				found = false;
				continue;
			} else
				System.out.println("Product found: " + product);
			found = true;

		}
		return found;

	}

	private static boolean searchingByAvailabilityQuantity(int quantity) {
		for (Product product : list) {
			if (!(product.getAvailable_quantity() >= quantity)) {
				found = false;
				continue;
			} else
				System.out.println(product);
		}
		return found;
	}
}
