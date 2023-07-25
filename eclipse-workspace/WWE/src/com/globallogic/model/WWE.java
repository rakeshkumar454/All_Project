package com.globallogic.model;

import com.globallogic.exception.InvalidWeightException;

public class WWE {

	private String firstName;
	private String lastName;
	private Integer weight;

	public WWE() {
		super();
	}

	public WWE(String firstName, String lastName, Integer weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

		/**
		 * Weight validation if weight is less than or equal to zero, I will not allow
		 * object creation and hence throwing invalid weight exception
		 */

		if (weight <= 0) {
			throw new InvalidWeightException("Weight cannot be " + weight);
		} else {
			this.weight = weight;
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		
		/**
		 * Weight validation if weight is less than or equal to zero, I will not allow
		 * object creation and hence throwing invalid weight exception
		 */

		if (weight <= 0) {
			throw new InvalidWeightException("Weight cannot be " + weight);
		} else {
			this.weight = weight;
		}
	}

	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}

}

