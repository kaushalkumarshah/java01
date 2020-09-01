package aggregation;

public class RunEmp {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setCompany("Hundai");
		car.setModel("I20");
		
		Employee emp = new Employee();
		emp.setName("Yuvraj");
		emp.setCar(car);
		
		
		System.out.println(emp.getCar().getModel());
		
		
		
	}

}
