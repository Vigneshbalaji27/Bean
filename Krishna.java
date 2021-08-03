package com.karthik;

public class Krishna {

	public static void main(String[] args) {
		System.out.println("love");
	}

}

class MyClass<T,U> {
	
	T t;
	U u;
	MyClass(T t,U u){
		this.t=t;
		this.u=u;
	}
	
	public void print() {
		System.out.println(t);
		System.out.println(u);
	}
}

class Main{
	public static void main(String[] args) {
		MyClass<String,Integer> obj=new MyClass<String,Integer>("Aarya",44);
		obj.print();
	}
}

