//testCustomer.java

public class testCustomer
{
	public static void main(String[] args)
	{
		//create instance
		Customer firstCustomer = new Customer();
		
		//invoke set accessors to populate attributes
		firstCustomer.setName("Joe");
		firstCustomer.setPhoneNumber(0177562345);
		firstCustomer.setAge(25);
		firstCustomer.setTotalAmount(100);
		
		//define variables to contain attribute values retrieved 
		String customerName; 
		int customerPhoneNumber; 
		int customerAge; 
		double customerTotalAmount;
		
		//invoke get accessors to retrive attribute values
		customerName=firstCustomer.getName();
		customerPhoneNumber=firstCustomer.getPhoneNumber();
		customerAge=firstCustomer.getAge();
		customerTotalAmount=firstCustomer.getTotalAmount();
		
		//display the retrieved attribute values
		System.out.println("The name is " + customerName );
		System.out.println("The Phone Number is " + customerPhoneNumber);
		System.out.println("The age is " + customerAge);
		System.out.println("The total amount is " + customerTotalAmount);
	}
	
	Customer firstCustomer = new Customer();
}