package com.globallogic.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.globallogic.exception.InvalidWeightException;
import com.globallogic.model.WWE;



public class WWEWrestlerImplementation {

	public static void main(String[] args) {

		try {

			List<WWE> wrestlers = new ArrayList<>(Arrays.asList(new WWE("John", "Cena", 215),
					new WWE("Roman", "Rings", 180), new WWE("Randy", "orton", 220), new WWE("Brock", "Lencer", 230),
					new WWE("Matt", "Hardy", 210)));

			System.out.println("\nNumber of Wrestlers : " + countNumberOfWrestlers(wrestlers));

			System.out.println("\nSum of weights of all wrestlers : "
					+ sumOfWeightOfAllWrestlersWhoseWeightIsAboveTwoHundres(wrestlers));

			System.out.println("\nList of first names of all wrestlers : \n" + returnsAllFirstNames(wrestlers));

			System.out.println("\nList of wrestlers whose name starts with a : \n"
					+ returnsAllWrestlersWhoseNameStartsWithA(wrestlers) + "\n");

			System.out.println("Count of wrestlers whose weight > 200 : "
					+ numberOfWrestlersWeightIsGreaterthanTwoHundred(wrestlers));

		} catch (InvalidWeightException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Number of Wrestlers
	 */
	private static long countNumberOfWrestlers(List<WWE> wrestlers) {
		return wrestlers.stream().count();
	}

	/**
	 * Sum of weights of all wrestlers
	 */
	private static int sumOfWeightOfAllWrestlersWhoseWeightIsAboveTwoHundres(List<WWE> wrestlers) {
		return wrestlers.stream().filter(wrestler -> wrestler.getWeight() > 200)
				.mapToInt(wrestler -> wrestler.getWeight()).sum();
	}

	/**
	 * List of first names of all wrestlers
	 */
	private static List<String> returnsAllFirstNames(List<WWE> wrestlers) {

		return wrestlers.stream().map(wrestler -> wrestler.getFirstName()).collect(Collectors.toList());

	}

	/**
	 * Wrestlers whose name starts with a
	 */
	private static List<WWE> returnsAllWrestlersWhoseNameStartsWithA(List<WWE> wrestlers) {

		return wrestlers.stream().filter(wrestler -> wrestler.getFirstName().toLowerCase().startsWith("a"))
				.collect(Collectors.toList());

	}

	/**
	 * Count of wrestlers whose is weight is morethan 200
	 */
	private static Long numberOfWrestlersWeightIsGreaterthanTwoHundred(List<WWE> wrestlers) {

		return wrestlers.stream().filter(wrestler -> wrestler.getWeight() > 200).count();

	}

}
