package com.globallogic.approach2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(1, "Table", 900d, 102), new Product(2, "Chair", 1500d, 10),
				new Product(3, "Glass", 999d, 101), new Product(4, "Fan", 2500d, 110));

		boolean quit = true;
		while (quit) {
			System.out.println("1.Sort by id \n2.Sort by name\n3.Sort by price\n4.Sort by available quantity\n5.To Exit");
			System.out.println("Select the operation you need to perform: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("=======Sorted by product ID========");
				list.stream().sorted(Comparator.comparing(Product::getId)).forEach(System.out::println);
				break;

			case 2:
				System.out.println("=======Sorted by product Name=========");
				list.stream().sorted(Comparator.comparing(Product::getName)).forEach(System.out::println);
				
				break;
			case 3:
				System.out.println("======Sorted by product price=======");
				list.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
		
				break;

			case 4:
				System.out.println("=======Sorted by product available quantity========");
				list.stream().sorted(Comparator.comparing(Product::getQuantity)).forEach(System.out::println);
				break;

			case 5:
				quit = false;
				System.exit(input);
			default:
				System.out.println("Please select the correct operation to perform");
			}
		}

	}
}