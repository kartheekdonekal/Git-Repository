package com.gitProject.selenium;

public class Test1{

	public Test1(String string) {
		
		
			
		}
	

	public static void main(String[] args) {
		
		//equals() method execution
		
		Test1 t1 = new Test1("Kartheek");
		Test1 t2 = new Test1("Kartheek");
		
		//object class equals() method executed (reference )
		
		System.out.println(t1.equals(t2)); //used for reference comparision
		
		String str1 = new String("Jeevan");
		String str2 = new String("Jeevan"); 
		
		//String class equals() method executed with the above it does content comparision because of the statement new keyword assigned for a string object
		System.out.println(str1.equals(str2)); //used for content comparision
		
		StringBuffer str3 = new StringBuffer("Vomsi");
		StringBuffer str4 = new StringBuffer("Vomsi");
		//String Buffer class equals() method executed and it is used for reference comparision because it is a stringBuffer class
		
		System.out.println(str3.equals(str4));
		
		
		//toString method() execution
		
	}

}
