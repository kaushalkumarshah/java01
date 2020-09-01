package abstraction;

public class RunBank {
	
	public static void main(String[] args) {
		
		Bank  b = new NMBBank();
		System.out.println(b.getName());
		b.moneyEx();
		
		
		UsereService  us = new UserServiceImpl();
		
		us.addUser();
		us.deleteUser();
		
	}

}
