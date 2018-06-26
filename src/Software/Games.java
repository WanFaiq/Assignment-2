package Software;

public class Games extends Software{
	public Games(String softwareName, String softwareType, double softwarePrice) {
		this.softwareName = softwareName;
		this.softwareType = softwareType;
		this.softwarePrice = softwarePrice;
	}
	
	public void print(int i) {
		System.out.println("Product " + (i + 1) + ": " + softwareName + "\t- RM" + softwarePrice);
	}
}
