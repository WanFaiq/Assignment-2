import java.util.Scanner;  //Needed for input class to read data  

import Books.Book;

public class Store 
{
    static Scanner sc = new Scanner(System.in); //static input class
    private static Book b[] = new Book[50];  //static information to store an array of 50 books,
    static Boolean exit = false; //static information to check whether it is true or false.
    private static int bCount = 0; //static integer to store bCount.
    
    /*Main method*/
    public static void main(String[] args) 
    {
        int option = 0;

        b[0] = new Book("Java, How to Program", 2017);
        b[1] = new Book("Mastering Java Machine Learning", 2016);
        b[2] = new Book("Python Crash Course", 2015);
        b[3] = new Book("The Life-Changing Magic of Tidying Up", 2014);
        b[4] = new Book("Managing Stress", 2018);
        b[5] = new Book("Principles: Life and Work", 2017);
        bCount = 6;

        System.out.println("<---------------Store---------------->");
        do 
        {
          System.out.println("1)\tRenting a book");
          System.out.println("2)\tReturning a book");
          System.out.println("3)\tPurchase a book");
          System.out.println("4)\tPrint out information for all the books");
          System.out.println("5)\tExit program");

          System.out.print("Please input your option: ");
          
            try 
            {
              option = Integer.parseInt(sc.nextLine());
            }
            
            catch (NumberFormatException e) 
            {
            	
            }

            switch(option) 
            {
               case 1:
                 rentBook();
                 break;
               
               case 2:
                 returnBook();
                 break;
                    
                case 3:
                  purchaseBook();
                  break;
                    
                case 4:
                  printAll();
                  break;
                    
                case 5:
                  System.out.println("\nExiting. Goodbye~");
                  exit = true;
                  break;
                    
                default:
                  System.out.println("\nInvalid option selected, try again.\n");
                  break;
             }
        } 
        
        while(!exit);
    }
    
    //static method for searchBook() ID
    private static int searchBook() 
    {
      String title;

      while(true) 
      {
        System.out.print("\nEnter the title of the book: ");
        title = sc.nextLine();
        
        for (int i = 0; i < bCount; i++) 
        {
          if (b[i].getTitle().equals(title)) 
          {
            return i;
          }
        }
            
        System.out.println("Book not found. Returning to menu~\n");
         
      }
    }

    //static method for rentBook() ID
    private static void rentBook() 
    {
      b[searchBook()].rentBook();
    }

    //static method for returnBook() ID
    private static void returnBook() 
    {
      b[searchBook()].returnBook();
    }

    //static method for purchaseBook() ID
    private static void purchaseBook() 
    {
      b[searchBook()].purchaseBook();
    }

    //static method to printAll() the books information
    private static void printAll() 
    {
       System.out.println("\n<---------------Book Details-------------->");
        
       for(int i = 0; i < bCount; i++) 
       {
         System.out.println("Book " + (i + 1) + ": " + "\"" + b[i].getTitle() + "\", \"" + b[i].getYear() + "\", \"" + b[i].getStatus() + "\"");
       }
        
       System.out.println("\nPrint complete. Returning to Menu~ \n");
    }
}