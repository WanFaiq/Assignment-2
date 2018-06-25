package Books;
/*-------------------------------------------------------------------------
 *                     Part B: Inheritance and Polymorphism
 *                     
 *    The bookstore now rents different types of books. These are comics,
 *    sci-fi and ICT (Information and Communications Technology). The
 *    information maintained for each book are:
 *    
 *       a) Book title
 *       b) Author Name
 *       c) Status (either "OUT" or "IN" or "PURCHASED").
 *       d) Price of book (for purchasing)
 *       
 *    In addition to renting out videos, customers are also allowed to buy
 *    them with a price. Hence, all the books have a price tag associated 
 *    with them. For comics, all comic books are RM10.00. For sci-fi,they
 *    are RM15.00 and for ICT, they are RM20.00.
 *    
 *    When video objects are first put into the store, the status should
 *    be "IN". Each time a video is rented, the status of that video is set 
 *    to "OUT". When a rented video is returned, the status is set back to
 *    "IN".
 *    
 *    The program should also have a main menu which displays 4 options for 
 *    the user to choose.
 *    These 4 options are:
 *       a) Renting a book (different category)
 *       b) Returning a book (different category)
 *       c) Purchase a book (different category)
 *       d) Printing out information for all the books
 *       e) Exit program
 *       
 *    Options (a), (b) and (c) are the same as in part 1 except that now,
 *    we have 3 types, namely comics, sci-fi and ICT. Hence, the user needs
 *    to specify both the book name and the type (comics, sci-fi and ICT).
 *    You will need to use both the book name and the type to find the book.
 *    
 *    If option (d) is chosen, print all information of all the books. The
 *    book objects should support a print() method for this purpose.
 *    
 *    Hint: Use inheritance for the 3 types of books.
 */

import java.text.DecimalFormat;  //Needed for decimal formatting

public class BookComic extends Book 
{
  double price;    //to store information on the price of the books.
  DecimalFormat df = new DecimalFormat("0.00"); //to format the decimal place into 2.

  public BookComic(String title, int year) 
  {
    this.title = title;
    this.year = year;
    status = "IN";
    price = 10;
  }

  //to get the price of the books
  public double getPrice() 
  {
    return price;
  }

  //to print all the information of the books
  public void print(int i) 
  {
    System.out.println("Book " + (i + 1) + ": " + "\"" + title + "\", \"" + year + "\", \"" + status + "\", \"RM" + df.format(price) + "\"");
  }

}