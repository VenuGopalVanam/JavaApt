package org.tasks.day19;

class Parent {
	// parent class variable
	String name = "Parent Name";

	// Parent class constructor
	Parent() {
		System.out.println("Parent Constructor");
	}

	// Parent class method
	public void parentMethod() {
		System.out.println("Parent Method ");
	}

}

class child extends Parent {
	// parent class variable
	String name = "child Name";

	// Parent class constructor
	child() {
		super();
		System.out.println("child Constructor");
	}

	// Child class method
	void show() {
		// Accessing parent variable
		System.out.println("Parent variable: " + super.name);

		// Accessing child variable
		System.out.println("Child variable: " + this.name);

		// Calling parent method
		super.parentMethod();
	}

}

public class SuperKeywordAndMethod {

	public static void main(String[] args) {
     
		child c = new child();
		c.show();
	}

}
