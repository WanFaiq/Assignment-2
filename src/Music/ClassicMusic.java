import java.text.DecimalFormat;  //Needed for decimal formatting

public class ClassicMusic extends Music 
{
	public ClassicMusic(String title, double price)
	{
		this.title=title;
		this.price=price;
	}
	
  double price;    //to store information on the price of the books.
  DecimalFormat df = new DecimalFormat("0.00"); //to format the decimal place into 2.

  public ClassicMusic(String title) 
  {
    this.title = title;
    status = "IN";
    price = 16;
  }
  public void setPrice(int price)
  {
  	this.price = price;
  }
//to get the price of the books
  public double getPrice() 
  {
    return price;
  }


  //to print all the information of the books
  public void print(int i) 
  {
    System.out.println("Music Disc " + (i + 1) + ": " + "\"" + title + "\", \"" + status + "\", \"RM" + df.format(price) + "\"");
  }

}