package org.tasks.day19;

public class JavaKeywords {

	public static void main(String[] args)  {
		//static method without creating oject 
		KeyWords.addBonus(10000);
		//object creation
		KeyWords key = new KeyWords();
		//even or odd
		key.oddOReven(10);
		//string reverse
		key.stringReverse("HELLO");
		//string revers using tocharArray
		key.stringRev("WORLD");
		//access specifiers 
		key.defaultMethod();
		key.publicMethod();
		key.protectedmethod();
		//final method
		key.showConstant();
		//try catch 
		key.division(10, 2);
		key.division(10, 0);
		//throw 
		try {
			key.checkAge(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			key.checkAge(16);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
