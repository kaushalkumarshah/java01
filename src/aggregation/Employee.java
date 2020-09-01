package aggregation;

public class Employee {
	
	private int id;
	private String name;
	private Car car; //HAS-A
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
	

}
