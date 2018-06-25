package Software;

public class Software {
	public String softwareName;
	public String softwareType;
	public double softwarePrice;
	
	public Software() {}
	
	public Software(String softwareName, String softwareType, int amount, double softwarePrice) {
		this.softwareName = softwareName;
		this.softwareType = softwareType;
		this.softwarePrice = softwarePrice;
	}
	
	public String getSoftwareName() {
		return softwareName;
	}
	
	public String getSofwareType() {
		return softwareType;
	}
	
	public Double getSofwarePrice() {
		return softwarePrice;
	}
	
	public String setSoftwareName(String softwareName) {
		return this.softwareName;
	}
	
	public String setSofwareType(String softwareType) {
		return this.softwareType;
	}
	
	public double setSoftwarePrice(double softwarePrice) {
		return this.softwarePrice;
	}

	
}
