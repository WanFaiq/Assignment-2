public class Music {
	 String title;    //to store the title of the book
	 String status;  //to store the information whether the book is "purchased", "IN", or "OUT" 
	 
	   public Music() 
	   {
		   this.title = "Future Music";
		   this.status = "IN";
	   }

	   public Music(String title)
	 {
	     this.title = title;
	     status = "IN";
	   }

	    //to get the title of the book
	    public String getTitle() 
	    {
	      return title;
	    }

	 

	    //to get the current status of the book
	    public String getStatus() 
	    {
	      return status;
	    }
	    
	    public void LatestMusicList()
	    {
	    	System.out.println("Available Latest Music");
	    	System.out.println("Selena Gomez");
	    	System.out.println("Taylor Swift");
	    	System.out.println("Justin Timberlake");
	    	System.out.println("One Direction");
	    }	
	    
	    
	  
	    //method for purchasMusic() ID
	    public void purchaseMusic() 
	    {
	      if(status.equals("IN")) 
	      {
	        status = "PURCHASED";
	        System.out.println("Music Disc is successfully purchased. Returning to menu~\n");
	      }
	        
	      else if (status.equals("OUT")) 
	      {
	        System.out.println("Music Disc currently rented out. Returning to menu~\n");
	      } 
	      
	      else 
	      {
	        System.out.println("Music Disc previously purchased. Returning to menu~\n");
	      }
	   }
	
}