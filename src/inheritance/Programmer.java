package inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String projectName;
	int bonus;
	
	public static void main(String[] args) {
		
		Programmer  p = new Programmer();
		
		p.id = 123;
		p.fname = "Nabin";
		p.lname = "Lama";
		p.salary = 8000;
		p.progLang = "java";
		
		
		
	}

}
