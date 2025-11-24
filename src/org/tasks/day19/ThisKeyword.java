package org.tasks.day19;
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name= name;
	}
	void display() {
		System.out.println("ID:"+ id +    "NAME:"+this.name);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Student s = new Student(101, "Srikanth");
		s.display();

	}

}
