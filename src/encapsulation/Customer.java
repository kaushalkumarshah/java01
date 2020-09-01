package encapsulation;

//POJO or model
public class Customer {
	
	/*
	 *   Encapsulation:
	 *     - data hiding : make properties private 
	 *     - data binding : make getter and setter public methods
	 */
 
	private int cid;
	private  String name;
	private String address;
	private String phone;
	
   
	public void setCid(int cid) {
	    this.cid = cid;
	}
	
	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}  
