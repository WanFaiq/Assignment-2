//Stapler.java

public class Stapler extends Stationeries
{
	public Stapler(String stationeryName, String stationeryType, double stationeryPrice)
	{
		this.stationeryName=stationeryName;
		this.stationeryType=stationeryType;
		this.stationeryPrice=stationeryPrice;
	}
	
	public void print (int i)
	{
		System.out.println("Product " + (i + 1) + ": " + stationeryName + "\t-RM" + stationeryPrice);
	}
}