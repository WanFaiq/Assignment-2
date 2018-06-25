package ComputerHardware;


public class ComputerHardware {
	public String hardwareName;
	public String hardwareType;
	public double hardwarePrice;
	public int hardwareYearMade;
	public int stock;
	
	public ComputerHardware()
	{
		hardwareName="";
		hardwareType="";
		hardwarePrice=0;
		hardwareYearMade=0;
		stock=0;
	}
	public ComputerHardware(String hardwareName, String hardwareType, double hardwarePrice, int hardwareYearMade, int stock)
	{
		this.hardwareName=hardwareName;
		this.hardwareType=hardwareType;
		this.hardwarePrice=hardwarePrice;
		this.hardwareYearMade=hardwareYearMade;
		this.stock=stock;
	}
	
	public String gethardwareName()
	{
		return hardwareName;
	}
	
	public String gethardwareType()
	{
		return hardwareType;
	}
	
	public double gethardwarePrice()
	{
		return hardwarePrice;
	}
	
	public int gethardwareYearMade()
	{
		return hardwareYearMade;
	}
	
	public int getstock()
	{
		return stock;
	}
	
	public void purchaseProduct() 
    {
      if(stock!=0) 
      {
        stock -= 1;
        System.out.println("Product successfully purchased. Returning to menu~\n");
      }
        
      else if (stock ==0) 
      {
        System.out.println("Product is currently out of stock. Returning to menu~\n");
      } 
   }
}
