package com.globallogic.approach1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductDriver {
	private static Scanner scanner = null;

	private static List<Product> products = null;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		products = populateProducts();

		while (true) {
			System.out.println(
					"\n1.View All Products"
					+ "\n2.Sort Products by Name"
					+ "\n3.Sort Products by Price"
					+ "\n4.Sort Products by Quantity"
					+ "\n5.Sort Products by Id"
					+ "\n6.Exit");
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nProducts  : ");
				sortProductsById();
				break;
			case 2:
				System.out.println("\nProducts Sorted By Name : ");
				sortProductsByName();
				break;
			case 3:
				System.out.println("\nProducts Sorted By Price : ");
				sortProductsByPrice();
				break;
			case 4:
				System.out.println("\nProducts Sorted By Quantity : ");
				sortProductsByQuantity();
				break;
			case 5:
				System.out.println("\nProducts Sorted By ID : ");
				sortProductsById();
				break;
			case 6:
				System.out.println("Thank You!!!!!");
				return ;
			}
		}

	}
	
//	Returns list of products
	private static List<Product> populateProducts() {

		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "ASUS", 35000.00, 5));
		products.add(new Product(2, "HP", 60000.00, 8));
		products.add(new Product(3, "APPLE", 82000.00, 10));
		return products;
	}

//	Sorts Products by Name
	private static void sortProductsByName() {

		products.stream()
		.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

//	Sorts product by price
	private static void sortProductsByPrice() {

		products.stream()
		.sorted(Comparator.comparing(Product::getPrice))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

//    Sorts Products by Quantity
	private static void sortProductsByQuantity() {

		products.stream().sorted(new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				
				return p1.getQuantity()-p2.getQuantity();
			}
		})
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
//	Sorts Products by ID
	private static void sortProductsById() {
		products.stream()
		.sorted(Comparator.comparing(Product::getId))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
