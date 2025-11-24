package org.tasks.day19;

public class KeyWords {

	/*if else*/ 
	public void oddOReven(int num) {
		if(num%2==0) {
			System.out.println(+num+ ":Number is even" );
		}else {
			System.out.println(+num+":Number is odd:");
		}
	}
	/*REVERSE OF A STRING*/
	public void stringReverse(String str) {
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
			
		}
		System.out.println("Reverse of string is:" +rev);
	}
	
	/*REVERSE OF A STRING  using Array Representation*/
	public void stringRev(String st) {
		char[] Array = st.toCharArray();
		int left=0;
		int right=Array.length-1;
		char temp;
		while(left<right) {
			temp = Array[left];
			Array[left]=Array[right];
			Array[right]=temp;
			left++;
			right--;
		}
		System.out.println("Reverse of a string is:"+new String(Array));
	}
	
	/*static and final keywords*/
	
	static final int bonus = 5000;

	// static  method
	public static int addBonus(int salary) {
		int totalsalary = salary+bonus;
		System.out.println("final salary is:" +totalsalary);
		return totalsalary;
	}

	// final method
	public final void showConstant() {
		System.out.println("Bonus Value: " + bonus);
	}
	/*try catch and finally*/
	
	public void division(int a, int b) {
		try {
			int result = a / b;
			System.out.println("Result is : " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!" +e.getMessage());
		}
		finally {
			System.out.println("Finally Block Executed.");
		}
	}
	/* Throw*/
	public void checkAge(int age) throws Exception {
		if (age > 18) {
	        System.out.println("Eligible to vote");
	    } else {
	        throw new Exception("Age is below 18 — Not eligible to vote!");
	    }
	}
	
	/*Access specifiers in java*/
	
	public void publicMethod() {
		 System.out.println("Public Method ");
	}
	private void privateMethod() {
		System.out.println("Private Method ");
	}
	void defaultMethod() {
		System.out.println("default Method ");
	}
	protected void protectedmethod() {
		System.out.println("Protected Method ");
	}
	
	
}
