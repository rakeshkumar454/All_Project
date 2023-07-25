package com.globallogic.wrestler.modal;

import com.globallogic.wrestler.exception.InvalidNameException;
import com.globallogic.wrestler.exception.InvalidWeightException;

public class WWE {
	
	private String firstName;
	private String lastName;
	private int weight;
	
	public WWE(String firstName, String lastName, int weight) throws Exception {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		validateDataMethod(this.firstName, this.lastName, this.weight);
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
	private void validateDataMethod(String firstName, String lastname, int weight) throws Exception {
		if(firstName == null || lastname == null)
			throw new InvalidNameException("First and Last name cannot be null");
		if(weight<80 || weight ==0)
			throw new InvalidWeightException("Weight should not be less than 80 or weight should not be zero");
		
	}

}
