//Item.java

public class Item 
{

	private String itemName;   //to store the itemName
	private double itemCost;   //to store the cost of the item

	public Item(String itemName, double itemCost) 
	{

		setItem(itemName, itemCost);
	}

	public void setItem(String itemName, double itemCost) 
	{
		this.setItemName(itemName);
		this.setItemCost(itemCost);
	}

	//to get the name of the item
	public String getItemName() 
	{
		return itemName;
	}

	//to set the name of the item
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	//to get the cost of the item
	public double getItemCost() 
	{
		return itemCost;
	}

	//to set the cost of the item 
	public void setItemCost(double itemCost) 
	{
		this.itemCost = itemCost;
	}

}