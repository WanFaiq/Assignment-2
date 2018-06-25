//Customer.java

public class Customer
{
	private String name;  //to store the name of the customer
	private int phoneNumber; //to store the phone number of the customer
	private int age;  //to store the age of the customer
	private double totalAmount; //to store the total amount spent by the customer
	
	/**Creates a new instance of Class*/
	public Customer()
	{
		
	}
	
	//to get the name of the customer
	public String getName()
	{
		return name;
	}
	
	//to get the phone number of the customer
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//to get the age of the customer
	public int getAge()
	{
		return age;
	}
	
	//to get the total amount spent by the customer
	public double getTotalAmount()
	{
		return totalAmount; 
	}
	
	//adds a customer
	public void addCustomer()
	{
		
	}
	
	//removes a customer
	public void deleteCustomer()
	{
		
	}
	
	//to set the name of the customer
	public void setName(String name)
	{
		this.name=name;
	}
	
	//to set the phone number of the customer
	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	
	//to set the age of the customer
	public void setAge(int age)
	{
		this.age=age;
	}
	
	//to set the total amount spent by the customer
	public void setTotalAmount(double totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	
}