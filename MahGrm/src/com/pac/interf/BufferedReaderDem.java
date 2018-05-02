package com.pac.interf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDem {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String n;
		try {
			n = br.readLine();
			System.out.println("Enter college");
			String collegeName = br.readLine();
			System.out.println(n + " " + collegeName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
