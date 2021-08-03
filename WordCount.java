package com.karthik;

import java.util.Scanner;

public class WordCount {
	
	  static int wordcount(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      } 
	  
	  static int wordc(String str) {
		  
		  if(str==null || str.isEmpty())
			  return 0;
		  
		  String wc[]=str.split(" ");
		  return wc.length;
		  
	  }
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String name:");
		String d=s.nextLine();
		int k=wordcount(d);
		int j=wordc(d);
		System.out.println("The number of words in the String is "+k +" words");
		System.out.println("The number of words in the String using split is "+j +" words");
		
	}

}
