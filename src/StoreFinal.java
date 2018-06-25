import java.text.DecimalFormat;
import java.util.Scanner;
import Software.*;
import Books.*;
import ComputerHardware.*;
import Music.*;

public class StoreFinal {
	static Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");

	// SOFTWARE
	private static Graphics productGraphics[] = new Graphics[30];
	private static Games productGames[] = new Games[30];
	private static Multimedia productMultimedia[] = new Multimedia[30];
	private static TextEditor productTextEditor[] = new TextEditor[30];

	private static int productGraphicsCount = 0;
	private static int productGamesCount = 0;
	private static int productMultimediaCount = 0;
	private static int productTextEditorCount = 0;

	// HARDWARE
	private static InputDevice productInput[] = new InputDevice[30];
	private static OutputDevice productOutput[] = new OutputDevice[30];
	private static Processors productProc[] = new Processors[30];
	private static Storage productStor[] = new Storage[30];

	private static int productInputCount = 0;
	private static int productOutputCount = 0;
	private static int productProcCount = 0;
	private static int productStorCount = 0;

	// MUSIC
	private static RockMusic mRock[] = new RockMusic[30];
	private static LatestMusic mLatest[] = new LatestMusic[30];
	private static ClassicMusic mClassic[] = new ClassicMusic[30];
	private static int mClassicCount = 0;
	private static int mRockCount = 0;
	private static int mLatestCount = 0;

	public static void main(String[] args) {

		// SOFTWARE
		graphicsSoftware();
		gamesSoftware();
		multimediaSoftware();
		textEditorSoftware();

		// HARDWARE
		initInputDevice();
		initOutputDevice();
		initProcessors();
		initStorage();
		
		// MUSIC
		rockMusic();
		latestMusic();
		classicMusic();

		int option = 0;

		Menu printMenu = new Menu();
		
		printMenu.printMainMenu();

		while (true) {

			System.out.print("Selection: ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("\nPlease select the type of product you want to look for");
				printMenu.printProductType();
				System.out.println("Selection: ");
				break;
			case 2:
				System.out.println("\nPlease select the type of product");
				printMenu.printProductType();
				System.out.println("Selection: ");
				break;
			case 3:
				printMenu.printCart();
				break;
			case 4:
				System.out.println("Are you sure you want to complete this transaction?");
				printMenu.printCart();
				break;
			case 5:
				System.out.println("Exiting... Goodbye!");
				return;
			case 6:

			default:
				System.out.println("That is not a valid option");
				break;
			}
		}
	}

	// =====================================================SOFTWARE===============================================
	private static void graphicsSoftware() {
		productGraphics[0] = new Graphics("Photoshop", "Graphics", 150.00);
		productGraphics[1] = new Graphics("Illustrator", "Graphics", 210.00);
		productGraphics[2] = new Graphics("3D MAX", "Graphics", 300.00);
		productGraphicsCount = 3;
	}

	private static void gamesSoftware() {
		productGames[0] = new Games("DOOM", "Games", 150.00);
		productGames[1] = new Games("Fallout", "Games", 145.00);
		productGames[2] = new Games("Skyrim", "Games", 70.00);
		productGamesCount = 3;
	}

	private static void multimediaSoftware() {
		productMultimedia[0] = new Multimedia("VLC", "Multimedia", 20.00);
		productMultimedia[1] = new Multimedia("KMPlayer", "Multimedia", 7.00);
		productMultimediaCount = 2;
	}

	private static void textEditorSoftware() {
		productTextEditor[0] = new TextEditor("Notepad++", "TextEditor", 5.00);
		productTextEditor[1] = new TextEditor("Visual Studio Code", "TextEditor", 30.00);
		productTextEditor[1] = new TextEditor("Sublime Text", "TextEditor", 20.00);
		productTextEditorCount = 2;
	}

	// =====================================================HARDWARE===============================================
	private static void initInputDevice() {
		productInput[0] = new InputDevice("Mouse", "InputDevice", 40, 2017, 10);
		productInput[1] = new InputDevice("Keyboard", "InputDevice", 50, 2016, 10);
		productInput[2] = new InputDevice("Microphone", "InputDevice", 99, 2018, 5);
		productInput[3] = new InputDevice("Webcam", "InputDevice", 89, 2017, 5);
		productInputCount = 4;
	}

	private static void initOutputDevice() {
		productOutput[0] = new OutputDevice("Monitor", "OutputDevice", 129, 2017, 10);
		productOutput[1] = new OutputDevice("Speaker", "OutputDevice", 60, 2016, 10);
		productOutputCount = 2;
	}

	private static void initProcessors() {
		productProc[0] = new Processors("AMD Ryzen", "Processors", 400, 2012, 6);
		productProc[1] = new Processors("Intel Core i5", "Processors", 350, 2016, 6);
		productProc[2] = new Processors("Intel Core i7", "Processors", 500, 2017, 7);
		productProcCount = 3;
	}

	private static void initStorage() {
		productStor[0] = new Storage("Adata SD700 External SSD", "Storage", 200, 2017, 10);
		productStor[1] = new Storage("WD My Book Duo 16TB", "Storage", 400, 2016, 10);
		productStor[2] = new Storage("OWC ThunderBay 4 Mini", "Storage", 120, 2018, 20);
		productStorCount = 3;
	}

	// =====================================================MUSIC===============================================
	private static void rockMusic() {
		mRock[0] = new RockMusic("Bon Jovi", 49.90);
		mRock[1] = new RockMusic("Linkin Park", 59.90);
		mRock[2] = new RockMusic("Shinedown", 39.90);
		mRock[3] = new RockMusic("Metallica", 20.90);
		mRockCount = 4;
	}

	private static void latestMusic() {
		mLatest[0] = new LatestMusic("Selena Gomez", 40);
		mLatest[1] = new LatestMusic("Taylor Swift", 25.50);
		mLatest[2] = new LatestMusic("Justin Timberlake", 49.90);
		mLatest[3] = new LatestMusic("One Direction", 30.25);
		mLatestCount = 4;

	}

	private static void classicMusic() {
		mClassic[0] = new ClassicMusic("Spice Girls", 35.50);
		mClassic[1] = new ClassicMusic("Trading Yesterday", 25);
		mClassic[2] = new ClassicMusic("Roxette", 30);
		mClassic[3] = new ClassicMusic("The Bangles", 25);
		mClassicCount = 4;
	}

}
