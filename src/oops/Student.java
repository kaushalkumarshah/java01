package oops;

public class Student {
	
	int id;
	String fname;
	String lname;
	String college;
	int age;
	
	void printStudentInfo() {
		
		System.out.println("Id  = "+id);
		System.out.println("FirstName = "+fname);
		System.out.println("LastName = "+lname);
		System.out.println("College = "+college);
		System.out.println("Age  = "+age);
	}
	
	public static void main(String[] args) {
		
		Student  s = new Student();
		
		s.id = 22;
		s.fname = "Ram";
		s.college = "NCC";

		s.printStudentInfo();
	}

}
