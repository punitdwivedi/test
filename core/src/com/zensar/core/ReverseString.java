package com.zensar.core;

public class ReverseString {
	
	public String reverseString(final String s){
		String reverse ="";
		for(int i=s.length()-1;i>=0;i--){
			char c = s.charAt(i);
			reverse += c; 
		}
		System.out.println(reverse);
		return reverse;
	}
	
	public String asciiChar(String s){
		String reverse ="";
		int []asciiArray = new int[s.length()];
		for(int i=0;i<s.length();i++){
			int ascii = s.charAt(i);
			asciiArray[i]=ascii;
			char c = s.charAt(i);
			System.out.println(c+" = "+ascii);
		}
		
		System.out.println("Multiplication...");
		long multiplication = 1;
		for (int j = 0; j < asciiArray.length; j++) {
			if(j<asciiArray.length-1){
				System.out.print(asciiArray[j]+" * ");
			}else{
				System.out.print(asciiArray[j]);
			}
			multiplication *= asciiArray[j];
		}
		System.out.println("= "+ multiplication);
		String multiplicationStr = multiplication+"";
		String result = s+multiplicationStr.charAt(multiplicationStr.length()-1);
		System.out.println("result="+result);
		return result;
	}
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.asciiChar("punit");
	}
}
