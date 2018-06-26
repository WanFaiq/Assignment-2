//testShoppingCart.java

public class testShoppingCart
{
	public static void main(String[] args) 
   {
	
    //list of items
	Item item1=new Item("",2);
	Item item2=new Item("",2);
	Item item3=new Item("",1);
	ItemOrder item1Order=new ItemOrder(item1, 4);
	ItemOrder item2Order=new ItemOrder(item2, 4);
	ItemOrder item3Order=new ItemOrder(item3, 3);
	ItemOrder item4Order=new ItemOrder(item3, 11);
	ShoppingCart shoppingCart=new ShoppingCart();
	shoppingCart.add(item1Order);
	shoppingCart.add(item2Order);
	shoppingCart.add(item3Order);

        System.out.println("Total cost:" +shoppingCart.getTotalPrice());
        System.out.println("Removing item one Order from  shopping cart:");
          shoppingCart.remove(item1Order);
          System.out.println("Total cost :"+shoppingCart.getTotalPrice());
           System.out.println("Checking for item three order:");
          	boolean isFound=shoppingCart.
            searchItem(item3Order);
		
		if(isFound)
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		
	     System.out.println("Checking for item four order in the shopping cart");
	      isFound=shoppingCart.searchItem(item4Order);
		}
		
	  if(isFound)
	  {
		System.out.println(":Yes");
	  }
   else
   {
		System.out.println(":No");
   }
 }
}
