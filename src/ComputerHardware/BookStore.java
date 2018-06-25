package ComputerHardware;

import java.util.Scanner;

public class BookStore {
	static Scanner sc = new Scanner(System.in);
	private static InputDevice productInput[] = new InputDevice[30];
	private static OutputDevice productOutput[] = new OutputDevice[30];
	private static Processors productProc[] = new Processors[30];
	private static Storage productStor[] = new Storage[30];
	static Boolean exit = false;
	private static int productInputCount = 0;
	private static int productOutputCount = 0;
	private static int productProcCount = 0;
	private static int productStorCount = 0;
	
	public static void main(String[] args) 
    {
        int option = 0;
        
        initInputDevice();
        initOutputDevice();
        initProcessors();
        initStorage();
        
        System.out.println("<----------Welcome to Our BookStore---------->");
        do 
        {
          System.out.println("1)\tPurchase a product");
          System.out.println("2)\tPrinting out information for all the products");
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
                 case 1:  purchaseProduct();
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
	
	
	private static void initInputDevice()
	{
		productInput[0]= new InputDevice("Mouse", "InputDevice", 40, 2017, 10);
		productInput[1]= new InputDevice("Keyboard", "InputDevice", 50, 2016, 10);
		productInput[2]= new InputDevice("Microphone", "InputDevice", 99, 2018, 5);
		productInput[3]= new InputDevice("Webcam", "InputDevice", 89, 2017, 5);
		productInputCount = 4;
	}
	private static void initOutputDevice()
	{
		productOutput[0]= new OutputDevice("Monitor", "OutputDevice", 129, 2017, 10);
		productOutput[1]= new OutputDevice("Speaker", "OutputDevice", 60, 2016, 10);
		productOutputCount = 2;
	}
	private static void initProcessors()
	{
		productProc[0]= new Processors("AMD Ryzen", "Processors", 400, 2012, 6);
		productProc[1]= new Processors("Intel Core i5", "Processors", 350, 2016, 6);
		productProc[2]= new Processors("Intel Core i7", "Processors", 500, 2017, 7);
		productProcCount = 3;
	}
	private static void initStorage()
	{
		productStor[0]= new Storage("Adata SD700 External SSD", "Storage", 200, 2017, 10);
		productStor[1]= new Storage("WD My Book Duo 16TB", "Storage", 400, 2016, 10);
		productStor[2]= new Storage("OWC ThunderBay 4 Mini", "Storage", 120, 2018, 20);
		productStorCount = 3;
	}
    private static int[] searchProduct() 
    {
      int option = 0;
      int[] i = new int[3];
      while(true) 
      {
        System.out.println("\n1) Input Device");
        System.out.println("2) Output Device");
        System.out.println("3) Processors");
        System.out.println("4) Storages\n");
        System.out.print("Please enter the type of the computer hardware you're looking for: ");

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
                 i = new int[]{1, searchInputDevice()};
                 break;
                 
               case 2:
                 i = new int[]{2, searchOutputDevice()};
                 break;
                 
               case 3:
                 i = new int[]{3, searchProcessors()};
                 break;
               case 4:
                   i = new int[]{4, searchStorage()};
                   break;
                 
                default:
                  System.out.println("Type of computer hardware not found. Returning to menu~\n.");
                  break;
            }
            
            if (i[1] != -1)
            {
                return i;
            }
        }
    }
    private static int searchInputDevice() 
    {
      String hardwareName;

      System.out.print("Enter the name of the input device: ");
      hardwareName = sc.nextLine();
        
        for (int i = 0; i < productInputCount; i++) 
        {
          if (productInput[i].gethardwareName().equals(hardwareName)) 
          {
             return i;
          }
          
        }
        
        System.out.println("Product not found. Returning to menu~\n.");
        return -1;
    }

    //static method integer to get searchBookSciFi() ID
    private static int searchOutputDevice() 
    {
      String hardwareName;

      System.out.print("Enter the name of the output device: ");
      hardwareName = sc.nextLine();
      
      for (int i = 0; i < productOutputCount; i++) 
      {
        if (productOutput[i].gethardwareName().equals(hardwareName)) 
        {
          return i;
        }
        
      }
      
        System.out.println("Product not found. Returning to menu~\n");
        return -1;
    }
    
    //static method integer to get searchBookICT() ID
    private static int searchProcessors() 
    {
      String hardwareName;

      System.out.print("Enter the name of the processor: ");
      hardwareName = sc.nextLine();
      
      for (int i = 0; i < productProcCount; i++) 
      {
        if (productProc[i].gethardwareName().equals(hardwareName)) 
        {
          return i;
        }
        
      }
      
        System.out.println("Product not found. Returning to menu~\n.");
        return -1;
    }
    private static int searchStorage() 
    {
      String hardwareName;

      System.out.print("Enter the name of the storage: ");
      hardwareName = sc.nextLine();
      
      for (int i = 0; i < productStorCount; i++) 
      {
        if (productStor[i].gethardwareName().equals(hardwareName)) 
        {
          return i;
        }
        
      }
      
        System.out.println("Product not found. Returning to menu~\n.");
        return -1;
    }
    
    private static void purchaseProduct() 
    {
      int[] i = searchProduct();

      switch(i[0]) 
      {
        case 1:
          productInput[i[1]].purchaseProduct();
          break;
          
        case 2:
          productOutput[i[1]].purchaseProduct();
          break;
          
        case 3:
          productProc[i[1]].purchaseProduct();
          break;
          
        case 4:
          productStor[i[1]].purchaseProduct();
      }
    }
    private static void printAll() 
    {
      System.out.println("\n<---------------Product Details-------------->");
      System.out.println("\nInput Devices:");
        
      for(int i = 0; i < productInputCount; i++) 
      {
        productInput[i].print(i);
      }
      
      System.out.println("\nOutput Devices:");
      
      for(int i = 0; i < productOutputCount; i++) 
      {
        productOutput[i].print(i);
      }
      
      System.out.println("\nProcessors:");
      
      for(int i = 0; i < productProcCount; i++) 
      {
        productProc[i].print(i);
      }
      
      System.out.println("\nStorages:");
      
      for(int i = 0; i < productStorCount; i++) 
      {
        productStor[i].print(i);
      }
      
      System.out.println("\nPrint complete. Returning to menu~\n");
    }
    
}
