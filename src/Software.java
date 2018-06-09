//NOT FINAL
public class Software {
	String softwareName;
	String softwareType;
	int amount;
	
	public Software() {}
	
	public Software(String softwareName, String softwareType, int amount) {
		this.softwareName = softwareName;
		this.softwareType = softwareType;
		this.amount = amount;
	}
	
	public String getSoftwareName() {
		return softwareName;
	}
	
	public String getSofwareType() {
		return softwareType;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String setSoftwareName(String softwareName) {
		return this.softwareName;
	}
	
	public String setSofwareType(String softwareType) {
		return this.softwareType;
	}
	
	public int setAmount(int amount) {
		return this.amount;
	}
	
}
