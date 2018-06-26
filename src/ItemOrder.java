//ItemOrder.java

public class ItemOrder
{
	
	private int quantity;  //to store the quantity of the item order
	private Item item;  //to store the item order
	public ItemOrder(Item item,int quantity) //to store the item and quantity as public
	{
		this.item=item;
		this.setQuantity(quantity);
	}
	
	//to get the quantity of the item order
	public int getQuantity() 
     {
		return quantity;
	 }
	
	//to set the quantity of the item order
	public void setQuantity(int quantity)
     {
		this.quantity = quantity;
	 }
	
	//to get the price of the item order
	public double getItemOrderPrice()
	{
		double itemOrderPrice = 0;
		if(quantity % 2 ==0)
		{
			for(int i=0;i<quantity/2;i++)
			itemOrderPrice+=4.0;		
			return itemOrderPrice;
		}
		
		else
		{
			for(int index=0;index<quantity/2;index++)
			itemOrderPrice+=4.0;
			
			return itemOrderPrice+item.getItemCost();	
		}
	}
}