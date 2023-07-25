package com.globallogic.wrestler.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.globallogic.wrestler.modal.WWE;

public class WWEWrestlerImplementation {

	public static void main(String[] args) throws Exception {

		List<WWE> wrestlerList = new ArrayList<>();
		wrestlerList.add(new WWE("akash", "Kumar", 150));
		wrestlerList.add(new WWE("Dharam", "Singh", 220));
		wrestlerList.add(new WWE("Mayank", "Thakur", 250));
	
		System.out.println("Count of number of wrestlers : "+wrestlerList.stream().count());
		System.out.println("Sum of all weight of all wrestlers whose weight is more than 200 : "+wrestlerList.stream().filter(w->w.getWeight()>200).mapToInt(x->x.getWeight()).sum());
		System.out.println("First Name of all wrestlers : "+printFirstName(wrestlerList));
		System.out.println("All wrestler whose name starts with a : ");
		wrestlerList.stream().filter(w->w.getFirstName().toLowerCase().startsWith("a")).forEach(System.out::println);
		System.out.println("Count of number of wrestlers whose weight is greater than 200 : "+wrestlerList.stream().filter(w->w.getWeight()>200).count());
		
		System.out.println("=================Validation Checks ======================");
		//To check second exception pls comment first one.
		wrestlerList.add(new WWE(null, null, 200));
		wrestlerList.add(new WWE("Rakesh", "Kumar", 0));
		
	}
	
	private static List<String> printFirstName(List<WWE> wrestlers) {
		return wrestlers.stream().map(w->w.getFirstName()).collect(Collectors.toList());
	}

}
