package Music;
import java.text.DecimalFormat;  //Needed for decimal formatting

public class LatestMusic extends Music
{
	public LatestMusic(String title, double price)
	{
		this.title=title;
		this.price=price;
	}
	
  double price;  //to store the price of the books
  DecimalFormat df = new DecimalFormat("0.00"); //to format decimal place into 2.

  public LatestMusic(String title) 
  {
    this.title = title;
    status = "IN";
    price = 15;
  }

  public void setPrice(int price)
  {
  	this.price = price;
  }
  
  //To get the price of the books
  public double getPrice() 
  {
    return price;
  }

   //To print out all the information of the books
    public void print(int i) 
    {
      System.out.println("Book " + (i + 1) + ": " + "\"" + title + "\", \"" + status + "\", \"RM" + df.format(price) + "\"");
    }
    
}