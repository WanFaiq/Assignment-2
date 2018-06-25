package Books;
import java.text.DecimalFormat;  //Needed for decimal formatting

public class BookICT extends Book 
{
  double price;  //to store the price of the books
  DecimalFormat df = new DecimalFormat("0.00"); //to format decimal place into 2

  public BookICT(String title, int year) 
  {
    this.title = title;
    this.year = year;
    status = "IN";
    price = 20;
  }

  //to get the price of the books
  public double getPrice() 
  {
    return price;
  }

  //to print out all the information of the books
  public void print(int i) 
  {
    System.out.println("Book " + (i + 1) + ": " + "\"" + title + "\", \"" + year + "\", \"" + status + "\", \"RM" + df.format(price) + "\"");
  }
  
}