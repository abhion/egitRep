package com.pac.interf;

public class IndiaPost implements IDeliver{
	@Override
	public void deliver(String name, long phone, String address) {
		System.out.println(" Indiapost Delivered to "+ name+" " + phone +" "+ address);
	}
}
