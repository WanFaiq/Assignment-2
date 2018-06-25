//ShoppingCart.java

import java.util.ArrayList;

public class ShoppingCart
{
	//list of items order
	private ArrayList<ItemOrder> shoppingCart=new ArrayList<ItemOrder>(); 
	
 	public ShoppingCart()
 	{
 		
 	}
 	
 	//add items order to the shopping cart
	public void add(ItemOrder itemOrder)
     {
	  shoppingCart.add(itemOrder);
	 }
	
	//remove items order from the shoppingCart
	public void remove(ItemOrder removeItemOrder)
	{
	  shoppingCart.remove(removeItemOrder);
	}
	
	//search items order from the shopping cart
	public boolean searchItem(ItemOrder searchOrder)
	{
	  boolean found=false;
	   for(int index=0;index<shoppingCart.size();index++)
	   {
		 if(searchOrder.equals(shoppingCart.get(index)))
		 found=true;
	   }
	    return found;
	}
	
	//get the total price of the items order in the shopping cart
	public double getTotalPrice()
	{
	   double total=0;
	   for(int i=0;i<shoppingCart.size();i++)
	   {
		 ItemOrder itemOrder=shoppingCart.get(i);
		 total+=itemOrder.getItemOrderPrice();
		}
	   return total;
	}
}