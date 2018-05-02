package com.pac.interf;

public class DHL implements IDeliver{
	@Override
	public void deliver(String name, long phone, String address) {
		System.out.println("DHL Delivered to "+ name+" " + phone +" "+ address);
	}
}
