package com.globallogic.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String>al1=new ArrayList<>();
		al1.add("Pant");
		al1.add("Virat");
		al1.add("Rohit");
		al1.add("Shreyas");
		al1.add("Surya");
		System.out.println("Team A : " +al1);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Samson");
		al2.add("Pant");
		al2.add("Surya");
		al2.add("Dhawan");
		System.out.println("Team B :" +al2);
		
		al1.addAll(al2);
		System.out.println("Both Team : "+al1);
		
	
		List<String> newteam= al1.stream().distinct().collect(Collectors.toList());
		System.out.println(newteam);
		Collections.sort(newteam);
		System.out.println(newteam);
	}

}
