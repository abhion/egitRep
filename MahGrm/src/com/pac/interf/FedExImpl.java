package com.pac.interf;

public class FedExImpl implements IDeliver {

	@Override
	public void deliver(String name, long phone, String address) {
		System.out.println("Fedex Delivered to "+ name+" " + phone +" "+ address);
	}

}
