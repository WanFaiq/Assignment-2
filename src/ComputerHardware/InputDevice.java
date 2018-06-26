package ComputerHardware;


public class InputDevice extends ComputerHardware{
	public InputDevice(String hardwareName, String hardwareType, double hardwarePrice, int hardwareYearMade, int stock)
	{
		this.hardwareName=hardwareName;
		this.hardwareType=hardwareType;
		this.hardwarePrice=hardwarePrice;
		this.hardwareYearMade=hardwareYearMade;
		this.stock=stock;
	}
	
	public void print(int i) 
	  {
	    System.out.println("Product " + (i + 1) + ": " + hardwareName + ", RM" +hardwarePrice + ", Made in " + hardwareYearMade + ", stock: " + stock);
	  }
}
