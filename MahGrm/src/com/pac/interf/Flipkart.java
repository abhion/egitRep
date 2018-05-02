package com.pac.interf;

import java.util.Random;

public class Flipkart {
	IDeliver sell(String name, long phone,String address ) {
		Random r = new Random();
		int option = r.nextInt(3)+1;
		if(option == 1) {
			new FedExImpl().deliver(name, phone, address);
		}else if(option == 2) {
			new IndiaPost().deliver(name, phone, address);
		}else if(option == 3) {
			new DHL().deliver(name, phone, address);
		}
		return new  DHL();
	}
	
	
}
