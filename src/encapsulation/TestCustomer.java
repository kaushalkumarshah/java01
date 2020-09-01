package encapsulation;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		Customer   c = new Customer();
		
		//c.cid = 555;
		c.setCid(888);
		c.setName("Hari ");
		c.setAddress("Kathmandu");
		c.setPhone("98343743878");
		 
		System.out.println(c);
		
		
		/*System.out.println("Id  = "+c.getCid());
		System.out.println("Name  = "+c.getName());
		System.out.println("Address = "+c.getAddress());
		System.out.println("Phone = "+c.getPhone());*/
		
	}

}
