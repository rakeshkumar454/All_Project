package com.globallogic.service;

import java.util.List;

import com.globallogic.entity.Address;

public interface IAddressService {

	public Address addUserAddress(Address address);
	public List<Address> getAllUserAddress();
	public void deleteAddressById(long id);
	public Address updateAddressById(Address address, long id);
	
}
