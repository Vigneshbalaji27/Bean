package com.karthik;

public class CubeSt {
	
	 public int cube(int x){  
		  return x*x*x;  
		  }  
	
	public static void main(String[] args) {
		
		 CubeSt c=new CubeSt(); 
		 int result=c.cube(41);
		  System.out.println(result);  
		  System.out.println(Double.MAX_VALUE);
		  System.out.println(Math.pow(2, 10));
		
	}

}
