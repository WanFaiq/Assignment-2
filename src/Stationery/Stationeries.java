package Stationery;

//Stationeries.java

public class Stationeries
{
	public String stationeryName;  //to store the brand of the stationeries
	public String stationeryType;  //to store the types of stationeries
	public double stationeryPrice; //to store the price of stationeries
	
	public Stationeries()
	{
		
	}
	
	public Stationeries(String stationeryName, String stationeryType, double stationeryPrice)
	{
		this.stationeryName=stationeryName;
		this.stationeryType=stationeryType;
		this.stationeryPrice=stationeryPrice;
	}
	
	//to get the brand of the stationeries
	public String getStationeryName()
	{
		return stationeryName;
	}
	
	//to get the types of stationeries
	public String getStationeryType()
	{
		return stationeryType;
	}
	
	//to get the price of stationeries
	public double stationeryPrice()
	{
		return stationeryPrice;
	}
	
	//to set the brand of the stationeries
	public String setStationeryName(String stationeryName)
	{
		return this.stationeryName;
	}
	
	//to set the types of stationeries
	public String setStationeryType(String stationeryType)
	{
		return this.stationeryType;
	}
	
	//to set the price of stationeries
	public double setStationeryPrice()
	{
		return this.stationeryPrice;
	}
}
