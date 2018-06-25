import java.text.DecimalFormat;  //Needed for decimal formatting

import Books.BookComic;
import Books.BookICT;
import Books.BookSciFi;

public class StoreV2 extends Store 
{
  DecimalFormat df = new DecimalFormat("0.00");
  private static BookComic bComic[] = new BookComic[50];
  private static BookSciFi bSciFi[] = new BookSciFi[50];
  private static BookICT bICT[] = new BookICT[50];
  private static int bComicCount = 0;
  private static int bSciFiCount = 0;
  private static int bICTCount = 0;

  /*Main method*/
  public static void main(String[] args) 
  {
    int option = 0;

    initComic();
    initSciFi();
    initICT();

    System.out.println("<---------------Store---------------->");
     do 
     {
       System.out.println("1)\tRenting a book (different category)");
       System.out.println("2)\tReturning a book (different category)");
       System.out.println("3)\tPurchase a book (different category)");
       System.out.println("4)\tPrinting out information for all the books");
       System.out.println("5)\tExit");
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
              case 1:  rentBook();
                         break;
                         
              case 2:  returnBook();
                         break;
                         
              case 3:  purchaseBook();
                         break;
                         
              case 4:  printAll();
                         break;
                         
              case 5:  System.out.println("\nExiting. Goodbye~");
                         exit = true;
                         break;
                         
              default: System.out.println("\nInvalid option selected, try again.\n");
                         break;
            }
            
        }
     
        while(!exit);
    }

   //static method for initComic()
    private static void initComic() 
    {
      bComic[0] = new BookComic("The Amazing Spider-Man, vol.2 #1", 1999);
      bComic[1] = new BookComic("Forbidden Scrollery, vol.1", 2017);
      bComicCount = 2;
    }
    
    //static method for initSciFi()
    private static void initSciFi() 
    {
      bSciFi[0] = new BookSciFi("The Hitchhiker's Guide to the Galaxy", 1979);
      bSciFiCount = 1;
    }

    //static method for initICT()
    private static void initICT() 
    {
      bICT[0] = new BookICT("Java, How to Program", 2017);
      bICT[1] = new BookICT("Mastering Java Machine Learning", 2016);
      bICT[2] = new BookICT("Python Crash Course", 2015);
      bICT[3] = new BookICT("UNIX and Linux System Administration Handbook, 4th Edition", 2010);
      bICTCount = 4;
    }

    //static method for int[] searchBook()
    private static int[] searchBook() 
    {
      int option = 0;
      int[] i = new int[2];
      while(true) 
      {
        System.out.println("\n1) Comics");
        System.out.println("2) Science Fiction");
        System.out.println("3) IT, Programming & Computer Science\n");
        System.out.print("Enter the genre of the book: ");

        try 
        {
           option = Integer.parseInt(sc.nextLine());
        } 
        
        catch (NumberFormatException e) 
        {
        	
        }

            switch (option) 
            {
               case 1:
                 i = new int[]{1, searchBookComic()};
                 break;
                 
               case 2:
                 i = new int[]{2, searchBookSciFi()};
                 break;
                 
               case 3:
                 i = new int[]{3, searchBookICT()};
                 break;
                 
                default:
                  System.out.println("Genre not found. Returning to menu~\n.");
                  break;
            }
            
            if (i[1] != -1)
            {
                return i;
            }
        }
    }
    
    //static method for integer to get searchBookComic() ID
    private static int searchBookComic() 
    {
      String title;

      System.out.print("Enter the title of the bookcomic: ");
      title = sc.nextLine();
        
        for (int i = 0; i < bComicCount; i++) 
        {
          if (bComic[i].getTitle().equals(title)) 
          {
             return i;
          }
          
        }
        
        System.out.println("Book not found. Returning to menu~\n.");
        return -1;
    }

    //static method integer to get searchBookSciFi() ID
    private static int searchBookSciFi() 
    {
      String title;

      System.out.print("Enter the title of the book: ");
      title = sc.nextLine();
      
      for (int i = 0; i < bSciFiCount; i++) 
      {
        if (bSciFi[i].getTitle().equals(title)) 
        {
          return i;
        }
        
      }
      
        System.out.println("Book not found. Returning to menu~\n");
        return -1;
    }
    
    //static method integer to get searchBookICT() ID
    private static int searchBookICT() 
    {
      String title;

      System.out.print("Enter the title of the book: ");
      title = sc.nextLine();
      
      for (int i = 0; i < bICTCount; i++) 
      {
        if (bICT[i].getTitle().equals(title)) 
        {
          return i;
        }
        
      }
      
        System.out.println("Book not found. Returning to menu~\n.");
        return -1;
    }

    //static method for rentBook() ID
    private static void rentBook() 
    {
      int[] i = searchBook();

      switch(i[0]) 
      {
        case 1:
          bComic[i[1]].rentBook();
          break; 
                
        case 2:
          bSciFi[i[1]].rentBook();
          break;
          
        case 3:
        bICT[i[1]].rentBook();
      }

    }
    
    //static method for returnBook() ID
    private static void returnBook() 
    {
      int[] i = searchBook();

      switch(i[0]) 
      {
        case 1:
          bComic[i[1]].returnBook();
          break;
          
        case 2:
          bSciFi[i[1]].returnBook();
          break;
          
        case 3:
          bICT[i[1]].returnBook();
      }
    }

    //static method for purchaseBook() ID
    private static void purchaseBook() 
    {
      int[] i = searchBook();

      switch(i[0]) 
      {
        case 1:
          bComic[i[1]].purchaseBook();
          break;
          
        case 2:
          bSciFi[i[1]].purchaseBook();
          break;
          
        case 3:
          bICT[i[1]].purchaseBook();
      }
    }

    //static method for printAll() the books information
    private static void printAll() 
    {
      System.out.println("\n<---------------Book Details-------------->");
      System.out.println("\nComic Books:");
        
      for(int i = 0; i < bComicCount; i++) 
      {
        bComic[i].print(i);
      }
      
      System.out.println("\nSci-Fi Books:");
      
      for(int i = 0; i < bSciFiCount; i++) 
      {
        bSciFi[i].print(i);
      }
      
      System.out.println("\nICT Books:");
      
      for(int i = 0; i < bICTCount; i++) 
      {
        bICT[i].print(i);
      }
      
      System.out.println("\nPrint complete. Returning to menu~\n");
    }
}