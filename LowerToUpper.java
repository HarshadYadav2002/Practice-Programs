package com.string;
//convert the string lowercase to uppercase
public class LowerToUpper {
	public static void main(String[] args) {
		String lowercase = "harshad Ashok YaDaV"; 
		String uppercase = ""; 

		for (int i = 0; i < lowercase.length(); i++) {
			char ch = lowercase.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				uppercase += (char) (ch - 'a' + 'A'); 
		            }
			else {
				uppercase += ch; 
		         }
		        }

		        System.out.println("Uppercase: " + uppercase);
		    }
		}



