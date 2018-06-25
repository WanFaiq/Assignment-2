package Books;
/*-----------------------------------------------------------------------
 *   Name       : Tan Kheng Kim
 *                Keevashiny a/p Chandrasegeran
 *   Student Id   : 0330918
 *   Course Module: Object-Oriented Programming
 *   Project Title: Assignment 1
 * -----------------------------------------------------------------------
 * 
 * -----------------------------------------------------------------------
 *                            Project Description
 *                            
 *                          Part A: Class and Object
 * 
 *    A bookstore has many different categories of books which customers
 *    can rent or buy. You are to write a Java Program which allows the 
 *    store to maintain its books inventory and to allow proper renting
 *    and returning of the books and purchasing the books. You may assume
 *    that the book store will not have more than 50 books.
 *    The information maintained for each book is:
 *      a) Book Title
 *      b) Author Name
 *      c) Status (either "OUT" or "IN" or "PURCHASED").
 *      
 *    For each title, the store only keeps one book. Each time a book is
 *    rented, the status of that book is set to "OUT". Otherwise,
 *    the status of the book should always be "IN". When someone is 
 *    interested to purchase the book, then set the status of the book to
 *    "PURCHASED". When someone is interested to purchase the book, then 
 *    set the status of the book to "PURCHASED". When a rented book is 
 *    returned, the status is set back to "IN". When the book is first
 *    created, its status should be set to "IN".
 *    
 *    When the program runs, it creates all the book objects and stores 
 *    the object references into an array. The books in the store are 
 *    described in the table below.
 *    
 *    -----------------------------------------------------------------
 *        Title                                 Publish Date
 *        Java, How to Program                       2017
 *        Mastering Java Machine Learning            2016
 *        Python Crash Course                        2015
 *        The life-changing Magic of Tidying Up      2014
 *        Managing Stress                            2018
 *        Principles: Life and Work                  2017
 *    ------------------------------------------------------------------
 *    The program should have a main menu which displays 5 options for the
 *    user to choose from.
 *    These 5 options are:
 *        a) Renting a book 
 *        b) Returning a book
 *        c) Purchase a book
 *        d) Print out information for all the books
 *        e) Exit program
 *        
 *    If option (a) is chosen, the program prompts the user to enter the
 *    title of the book which is to be rented. The program then attempts
 *    to find the book (object associated with that book in the array). If
 *    the book is found and the status is "IN", then the book can be 
 *    rented. That means, the status should be set to "OUT". If the status
 *    is already "OUT", that means the book is already rented out. In this
 *    case, the program should display an appropriate message. If the book
 *    is not found at all, the program should also print appropriate
 *    message. Finally, the program goes back to the main menu which
 *    displays the 5 options again.
 *    
 *     If option (b) is chosen, the user enters the name of the book to be
 *     returned. The program then finds the book, sets its status to "IN",
 *     and then goes back to the main menu. If the book cannot be found,
 *     it prints out an appropriate message.
 *     
 *     If option (c) is chosen, the user enters the name of the book to
 *     purchase. The program then finds the book, sets its status to 
 *     "PURCHASED" with a confirmation message ("Are you sure to purchase
 *     the book?")- received the answer as 'Y' or 'N', and then goes back
 *     to the main menu. If the book cannot be found, it prints out an
 *     appropriate message.
 *     
 *     If option (d) is chosen, the program prints out the book information
 *     for each book in the store. The information consists of the title,
 *     published year and the status. This option is useful for testing the
 *     program.
 *     
 *     If option (e) is chosen, the program should exit the loop.
 *     
 *     Create a Java class to hold the information for each book and to
 *     provide the appropriate rent, purchase and return methods. Call
 *     this class book. You will also need to create another class 
 *     (driver class to manage all the book objects. Name this second-class
 *     Store. The Store class should have a public static void main
 *     (String[] args). It should also use an array to manage the different
 *     book objects.
 * -----------------------------------------------------------------------
 */

public class Book 
{
   String title;    //to store the title of the book
   int year;       //to store the year the book has been published
   String status;  //to store the information whether the book is "purchased", "IN", or "OUT" 

   public Book() 
   {

   }

   public Book(String title, int year)
   {
     this.title = title;
     this.year = year;
     status = "IN";
   }

    //to get the title of the book
    public String getTitle() 
    {
      return title;
    }

    //to get the year published of the book
    public int getYear()
    {
      return year;
    }

    //to get the current status of the book
    public String getStatus() 
    {
      return status;
    }
    
    //method for rentBook() ID
    public void rentBook() 
    {
       if(status.equals("IN")) 
       {
         status = "OUT";
         System.out.println("Book successfully rented. Returning to menu~\n");
       } 
        
       else if (status.equals("OUT")) 
       {
         System.out.println("Book currently rented out. Returning to menu~\n");
       }
        
       else 
       {
         System.out.println("Book already purchased. Returning to menu~\n");
       }
    }

    //method for returnBook() ID
    public void returnBook() 
    {
      if(status.equals("OUT")) 
      {
        status = "IN";
        System.out.println("Book successfully returned. Returning to menu~\n");
      }
        
      else if (status.equals("IN")) 
      {
        System.out.println("Book not currently rented out. Returning to menu~\n");
      } 
        
      else 
      {
        System.out.println("Book already purchased. Returning to menu~\n");
      }
    }
    
    //method for purchaseBook() ID
    public void purchaseBook() 
    {
      if(status.equals("IN")) 
      {
        status = "PURCHASED";
        System.out.println("Book successfully purchased. Returning to menu~\n");
      }
        
      else if (status.equals("OUT")) 
      {
        System.out.println("Book currently rented out. Returning to menu~\n");
      } 
      
      else 
      {
        System.out.println("Book previously purchased. Returning to menu~\n");
      }
   }
}