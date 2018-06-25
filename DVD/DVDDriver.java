import java.util.Scanner;
public class DVDDriver {
//array	
private static Action actionFilm[] = new Action[3];
private static Animation animationFilm[] = new Animation[3];
private static SciFi scifiFilm[] = new SciFi[3];
private static Thriller thrillerFilm[] = new Thriller[3];	

	public static void main(String[]args) {
		
		System.out.println("Welcome to our new DVD section!");
		
		//where the value of the arrays are
		ActionFilms();
		ThrillerFilms();
		SciFiFilms();
		AnimationFilms();
		displayMenu();
		
	}//outside main
	
	
	private static void displayMenu() {
		
		
		System.out.println("\nPress 1 to view the available films");
		System.out.println("Press 2 to rent a film");
		System.out.println("Press 3 to close this program\n");
		
		//user input 
		Scanner scan = new Scanner(System.in);
		//where & when the input is received
		int input = scan.nextInt();	
		System.out.println("Number entered: " + input);
		
		switch (input) {
		case 1: viewFilms(); break;
		case 2: rentFilm(); break;
		case 3: System.out.println("Program Closing, have a nice day."); break;
		
		}
	}
	
	private static void viewFilms() {
		System.out.println("\nList of Action Films:");
		for (int x = 0; x < actionFilm.length; x++) {
			System.out.println(actionFilm[x]);
		}
		System.out.println("\nList of Animated Films:");
		for (int x = 0; x < animationFilm.length; x++) {
			System.out.println(animationFilm[x]);
		}
		System.out.println("\nList of Sci-Fi Films:");
		for (int x = 0; x < scifiFilm.length; x++) {
			System.out.println(scifiFilm[x]);
		}
		System.out.println("\nList of Thriller Films:");
		for (int x = 0; x < thrillerFilm.length; x++) {
			System.out.println(thrillerFilm[x]);
		}
		displayMenu();
	}
	
	//Genre Arrays
		private static void ActionFilms() {
			actionFilm[0] = new Action("Avengers", "Joss Whedon", 2012, 143 );
			actionFilm[1] = new Action("Avengers - Age of Ultron", "Joss Whedon", 2015, 142);
			actionFilm[2] = new Action("Avengers - Infinity War part I ", "Anthony Russo & Joe Russo", 2018, 160);
		}
		private static void AnimationFilms() {
			animationFilm[0] = new Animation("Kubo and the Two Strings","Travis Knight", 2016, 102);
			animationFilm[1] = new Animation("Big Hero Six","Don Hall & Chris Williams",2014 , 108);
			animationFilm[2] = new Animation("Coco","Lee Unkrich", 2017, 109);
		}
		private static void SciFiFilms() {
			scifiFilm[0] = new SciFi("Arrival", "Denis Villeneuve",2016 ,118 );
			scifiFilm[1] = new SciFi("The Matrix", "Lilly Wachowski & Lana Wachowski\r\n", 1999 ,150 );
			scifiFilm[2] = new SciFi("Ex MAchina", "Alex Garland",2015 ,110 );
		}
		private static void ThrillerFilms() {
			thrillerFilm[0] = new Thriller("Inception", "Christopher Nolan", 2010, 148);
			thrillerFilm[1] = new Thriller ("Gone Girl", "David Fincher", 2014, 149);
			thrillerFilm[2] = new Thriller ("taken", "Pierre Morel",2009 ,93 );
		}
		
	
	private static void rentFilm() {
		int tryAgain=1;
		while (tryAgain!=0) {
			
			System.out.print("\nEnter the name of the Film you'd like to rent: ");
			Scanner scan = new Scanner (System.in);
			String filmSelected = scan.nextLine();
			
				switch(filmSelected) {
					case "Avengers": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break;
					case "Avengers - Age of Ultron": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break;
					case "Avengers - Infinity War part I": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					
					case "Kubo and the Two Strings": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "Big Hero Six": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "Coco": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "Arrival": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "The Matrix": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "Ex Machina": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break;
					case "Inception": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					case "Gone Girl": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
					tryAgain = 0; 
					break; 
					case "Taken": System.out.println("You may proceed to the counter to collect the film " + filmSelected); 
						tryAgain = 0; 
						break; 
					
					default: System.out.println("Invalid input, please try again."); tryAgain = 1;
				}		
		}
		displayMenu();
	}
}
//outside everything