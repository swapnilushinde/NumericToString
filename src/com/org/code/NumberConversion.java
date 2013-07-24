package com.org.code;

import java.util.HashMap;

public class NumberConversion {

	private HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public NumberConversion() {
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		hm.put(6, "Six");
		hm.put(7, "Seven");
		hm.put(8, "Eight");
		hm.put(9, "Nine");
		hm.put(0, "Zero");
		hm.put(10, "Ten");
		hm.put(11, "Eleven");
		hm.put(12, "Twelve");
		hm.put(13, "Thirteen");
		hm.put(14, "Fourteen");
		hm.put(15, "Fifteen");
		hm.put(16, "Sixteen");
		hm.put(17, "Seventeen");
		hm.put(18, "Eighteen");
		hm.put(19, "Ninteen");
		hm.put(20, "Twenty");
		hm.put(30, "Thirty");
		hm.put(40, "Fourty");
		hm.put(50, "Fifty");
		hm.put(60, "Sixty");
		hm.put(70, "Seventy");
		hm.put(80, "Eighty");
		hm.put(90, "Ninty");
	}

	public String ConvertNumber(String number, String s) {
		// Base case		
		if(number.length() == 0){
			return "";
		}

		String s1 = "";
		
		int start = 0;
		int end;
		if (number.length() % 3 == 0) {
			end = start + 3;
		} else {
			end = number.length() - ((int) number.length() / 3) * 3;
		}
		System.out.println("start " + start + " end " + end);
		String piece = number.substring(start, end);
		int pos = number.length();
		System.out.println("piece " + piece + " pos " + pos);
		System.out.println("****" );
		s1 = getString(piece, pos);
		System.out.println("****" );
		s1 = s1 + ConvertNumber(number.substring(end), s1);
		return s1;
	}
	
	public String getString(String piece, int pos){
		System.out.println("Inside getstring "+ piece + " " + pos);
		String s = "";
		int n = Integer.parseInt(piece);
		
		if(hm.containsKey(n)){
			s += hm.get(n);		
		}
		else{
			if(piece.length() == 2){
				int r = n % 10;
				int a = ((int) n/10) * 10;
				System.out.println(hm.get(a) + " " + hm.get(r));
				s = s + hm.get(a) + " " + hm.get(r); 
			}
			if(piece.length() == 3){
				int r = n % 100;
				int a = n/100;
				// Hundredth position
				if(a != 0){
					s += hm.get(a) + " Hundreds ";
				}
				// Tenth position
				if(r != 0){
					int r1 = r % 10;
					int a1 = ((int) r/10) * 10;
					s += hm.get(a1) + " " + hm.get(r1);
				}
			}
		}
		if(pos <=6 && pos>3){
			s += " Thousands ";
		}
		if(pos <=9 && pos>6){
			s += " Millions ";
		}
		if(pos <=12 && pos>9){
			s += " Trillions ";
		}
		
		System.out.println(s);
		return s;
	}

}
