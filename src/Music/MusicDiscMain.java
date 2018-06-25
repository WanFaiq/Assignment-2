package Music;

import java.text.DecimalFormat;  //Needed for decimal formatting
import java.util.Scanner;

public class MusicDiscMain
{
  
	DecimalFormat df = new DecimalFormat("0.00");
    static Scanner sc = new Scanner(System.in); 
    static Boolean exit = false; //static information to check whether it is true or false.

  private static RockMusic mRock[] = new RockMusic[50];
  private static LatestMusic mLatest[] = new LatestMusic[5];
  private static ClassicMusic mClassic[] = new ClassicMusic[50];
  private static int mClassicCount = 0;
  private static int mRockCount = 0;
  private static int mLatestCount = 0;

  /*Main method*/
  public static void main(String[] args) 
  {
	  int option = 0;

	  RockMusic();
	  ClassicMusic();
	  LatestMusic();

	  System.out.println("<---------------Store---------------->");
	     do 
	     {
	   
	       System.out.println("1)\tPurchase a Music Disc (3 different category)");
	       System.out.println("2)\tPrinting out information for all Informtaion");
	       System.out.println("3)\tExit");
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
	              case 1:  purchaseMusic();
	              		
	                         break;
	                         
	              case 2:  printAll();
	                         break;
	                         
	              case 3:  System.out.println("\nExiting. Goodbye~");
	                         exit = true;
	                         break;
	                         
	              default: System.out.println("\nInvalid option selected, try again.\n");
	                         break;
	            }
	            
	        }
	     
	        while(!exit);
	     
  }

  private static void RockMusic() 
  {
    mRock[0] = new RockMusic("Bon Jovi", 49.90);
    mRock[1] = new RockMusic("Linkin Park", 59.90);
    mRock[2] = new RockMusic("Shinedown", 39.90);
    mRock[3] = new RockMusic("Metallica", 20.90);
    mRockCount = 4;
  }
  
  //static method for LatestHits()
  private static void LatestMusic() 
  {
    mLatest[0] = new LatestMusic("Selena Gomez", 40);
    mLatest[1] = new LatestMusic("Taylor Swift", 25.50);
    mLatest[2] = new LatestMusic("Justin Timberlake", 49.90);
    mLatest[3] = new LatestMusic("One Direction", 30.25);
    mLatestCount = 4;

  }

  //static method for Classic()
  private static void ClassicMusic() 
  {
	  mClassic[0] = new ClassicMusic("Spice Girls", 35.50);
	  mClassic[1] = new ClassicMusic("Trading Yesterday", 25);
	  mClassic[2] = new ClassicMusic("Roxette", 30);
	  mClassic[3] = new ClassicMusic("The Bangles", 25);
    mClassicCount = 4;
  }

  //static method for type of music()
  private static int[] MusicGenre() 
  {
    int option = 0;
    int[] i = new int[2];
    while(true) 
    {
      System.out.println("1) Latest");
      System.out.println("2) CLassic");
      System.out.println("3) Rock");
      System.out.print("Enter type of music based on it's Number: ");

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
            	System.out.println("Available Latest Music, select one available only"); // music availability
     	    	System.out.println("Selena Gomez");
     	    	System.out.println("Taylor Swift");
     	    	System.out.println("Justin Timberlake");
     	    	System.out.println("One Direction"); 
     	    	
             i = new int[]{1, searchLatestMusic()};
               break;
               
             case 2:
            	System.out.println("Available Classic Music, select one available only"); // music availability
      	    	System.out.println("Spice Girls");
      	    	System.out.println("Trading Yesterday");
      	    	System.out.println("Roxette");
      	    	System.out.println("The Bangles"); 
            	 
               i = new int[]{2, searchClassicMusic()};
               break;
               
             case 3:
            	System.out.println("Available Rock Music, select one available only"); // music availability
      	    	System.out.println("Bon Jovi");
      	    	System.out.println("Linkin Park");
      	    	System.out.println("Shinedown");
      	    	System.out.println("Metallica"); 
            	 
               i = new int[]{3, searchRockMusic()};
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
  private static int searchLatestMusic() 
  {
    String title;

    System.out.print("Enter by typing the title Music:");
    title = sc.nextLine();
      
      for (int i = 0; i < mLatestCount; i++) 
      {
        if (mLatest[i].getTitle().equals(title)) 
        {
           return i;
        }
        
      }
      
      System.out.println("Music disc not found. Returning to menu~\n.");
      return -1;
  }

  //static method integer to get searchClassicMusic() ID
  private static int searchClassicMusic() 
  {
    String title;

    System.out.print("Enter by typing the title Music: ");
    title = sc.nextLine();
    
    for (int i = 0; i < mClassicCount; i++) 
    {
      if (mClassic[i].getTitle().equals(title)) 
      {
        return i;
      }
      
    }
    
      System.out.println("Music disc not found. Returning to menu~\n");
      return -1;
  }
  
  //static method integer to get searchBookICT() ID
  private static int searchRockMusic() 
  {
    String title;

    System.out.print("Enter by typing the title Music:");
    title = sc.nextLine();
    
    for (int i = 0; i < mRockCount; i++) 
    {
      if (mRock[i].getTitle().equals(title)) 
      {
        return i;
      }
      
    }
    
      System.out.println("Music disc not found. Returning to menu~\n.");
      return -1;
  }


 

  //static method for purchaseMusic() ID
  private static void purchaseMusic() 
  {
    int[] i = MusicGenre();

    switch(i[0]) 
    {
      case 1:
        mLatest[i[1]].purchaseMusic();
        break;
        
      case 2:
        mClassic[i[1]].purchaseMusic();
        break;
        
      case 3:
        mRock[i[1]]. purchaseMusic();
    }
  }

  //static method for printAll() the books information
  private static void printAll() 
  {
    System.out.println("\n<---------------Music Shelf-------------->");
    System.out.println("\nRock Music:");
      
    for(int i = 0; i < mRockCount; i++) 
    {
      mRock[i].print(i);
    }
    
    System.out.println("\nLatest Hits:");
    
    for(int i = 0; i < mLatestCount; i++) 
    {
      mLatest[i].print(i);
    }
    
    System.out.println("\nClassic Music:");
    
    for(int i = 0; i < mClassicCount; i++) 
    {
      mClassic[i].print(i);
    }
    
    System.out.println("\nPrint complete. Returning to menu~\n");
  }
}
