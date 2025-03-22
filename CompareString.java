package com.string;
//Comparing the two Strings. using equals() and compareTo()
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="World";
		String str3=new String("Hello");
		String str4 = "World";
		
		//==
		System.out.println("Using == Operator.....");
		System.out.println("Str1 == Str2 "+str1 == str2);
		System.out.println("Str1 == Str3 "+str1 == str3);
		
		System.out.println("----------------------------------------------------");
		
		//equals()
		System.out.println("Using equals() method......");
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		System.out.println("str1.equals(str4): " + str1.equals(str4));
		
		System.out.println("-----------------------------------------------------");
		
		//compareTO
		System.out.println("Using compareTo() method......");
		System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
		System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
		System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
		System.out.println("str4.compareTo(str1): " + str4.compareTo(str1));
		
		System.out.println("---------------------------------------------------------");
	}

}
