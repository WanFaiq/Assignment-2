package Software;

public class Multimedia extends Software{
	public Multimedia(String softwareName, String softwareType, int amount, double softwarePrice) {
		this.softwareName = softwareName;
		this.softwareType = softwareType;
		this.softwarePrice = softwarePrice;
	}
	
	public void print(int i) {
		System.out.println("Product " + (i + 1) + ": " + softwareName + "\t- RM" + softwarePrice);
	}
}
