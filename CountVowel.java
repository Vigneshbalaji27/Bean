package com.karthik;

import java.util.Scanner;
public class CountVowel {
	
	static int retvow(String str) {
		int count = 0;
		String str1=str.toLowerCase();
	      for (int i=0 ; i<str1.length(); i++){
	         char ch = str1.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	     
	}
	      return count;
	}
   public static void main(String args[]){
     
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int c=retvow(s);

      System.out.println("Number of vowels in the given sentence is "+c);
   }
}