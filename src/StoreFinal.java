import java.text.DecimalFormat;
import java.util.Scanner;
import Software.*;
import Books.*;
import ComputerHardware.*;
import Music.*;
import Stationery.*;

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

	// Stationery
	private static Eraser sEraser[] = new Eraser[30];
	private static Pen sPen[] = new Pen[30];
	private static Pencil sPencil[] = new Pencil[30];
	private static Stapler sStapler[] = new Stapler[30];
	private static int sEraserCount = 0;
	private static int sPenCount = 0;
	private static int sPencilCount = 0;
	private static int sStaplerCount = 0;

	// BOOK
	private static BookComic bComic[] = new BookComic[30];
	private static BookSciFi bSciFi[] = new BookSciFi[30];
	private static BookICT bICT[] = new BookICT[30];
	private static int bComicCount = 0;
	private static int bSciFiCount = 0;
	private static int bICTCount = 0;

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

		// STATIONERY
		Eraser();
		Pen();
		Pencil();
		Stapler();

		// BOOK
		bookComic();
		bookSciFi();
		bookICT();

		int option = 0;
		int printOption = 0;
		int purchaseOption = 0;

		Menu printMenu = new Menu();

		printMenu.printMainMenu();

		while (true) {

			System.out.print("Main menu selection (6 to bring back the main menu): ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("\nPlease select the type of product you want to look for");
				printMenu.printProductType();
				System.out.print("Selection: ");
				printOption = input.nextInt();
				switch (printOption) {
				case 1:
					printHardware();
					break;
				case 2:
					printSoftware();
					break;
				case 3:
					printMusic();
					break;
				case 4:
					printStationery();
					break;
				case 6:
					printBook();
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("\nPlease select the type of product");
				printMenu.printProductType();
				System.out.print("Selection: ");
				purchaseOption = input.nextInt();
				switch (purchaseOption) {
				case 1:
					purchaseHardware();
					break;
				case 2:
					printSoftware();
					break;
				case 3:
					printMusic();
					break;
				case 4:
					printStationery();
					break;
				case 6:
					printBook();
					break;
				default:
					break;
				}
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
				printMenu.printMainMenu();
				break;
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

	// =====================================================STATIONERY===============================================
	private static void Eraser() {
		sEraser[0] = new Eraser("Stabilo Eraser", "Eraser", 2.50);
		sEraserCount = 1;
	}

	private static void Pen() {
		sPen[0] = new Pen("Paper Mate", "pen", 3.00);
		sPen[1] = new Pen("Fabel Castle", "Pen", 4.00);
		sPenCount = 2;
	}

	private static void Pencil() {
		sPencil[0] = new Pencil("Stabilo Pencil", "Pencil", 3.00);
		sPencil[1] = new Pencil("Faber caster Pencil", "Pencil", 3.00);
		sPencilCount = 2;
	}

	private static void Stapler() {
		sStapler[0] = new Stapler("Paper Mate", "stapler", 5.00);
		sStaplerCount = 1;
	}

	// =====================================================BOOKS===============================================
	private static void bookComic() {
		bComic[0] = new BookComic("The Amazing Spider-Man, vol.2 #1", 1999);
		bComic[1] = new BookComic("Forbidden Scrollery, vol.1", 2017);
		bComicCount = 2;
	}

	private static void bookSciFi() {
		bSciFi[0] = new BookSciFi("The Hitchhiker's Guide to the Galaxy", 1979);
		bSciFiCount = 1;
	}

	// static method for initICT()
	private static void bookICT() {
		bICT[0] = new BookICT("Java, How to Program", 2017);
		bICT[1] = new BookICT("Mastering Java Machine Learning", 2016);
		bICT[2] = new BookICT("Python Crash Course", 2015);
		bICT[3] = new BookICT("UNIX and Linux System Administration Handbook, 4th Edition", 2010);
		bICTCount = 4;
	}

	// PRINTING SECTION
	// HARDWARE PRINT
	private static void printHardware() {
		System.out.println("\n========== Hardware ==========");
		System.out.println("\nInput Devices:");

		for (int i = 0; i < productInputCount; i++) {
			productInput[i].print(i);
		}

		System.out.println("\nOutput Devices:");

		for (int i = 0; i < productOutputCount; i++) {
			productOutput[i].print(i);
		}

		System.out.println("\nProcessors:");

		for (int i = 0; i < productProcCount; i++) {
			productProc[i].print(i);
		}

		System.out.println("\nStorages:");

		for (int i = 0; i < productStorCount; i++) {
			productStor[i].print(i);
		}

		System.out.println("\nPrint complete. Returning to the main menu...");
	}

	// SOFTWARE PRINT
	private static void printSoftware() {
		System.out.println("\n========== Software ==========");
		System.out.println("\nGraphics:");

		for (int i = 0; i < productGraphicsCount; i++) {
			productGraphics[i].print(i);
		}

		System.out.println("\nGames:");

		for (int i = 0; i < productGamesCount; i++) {
			productGames[i].print(i);
		}

		System.out.println("\nMultimedia:");

		for (int i = 0; i < productMultimediaCount; i++) {
			productMultimedia[i].print(i);
		}

		System.out.println("\nText Editors:");

		for (int i = 0; i < productTextEditorCount; i++) {
			productTextEditor[i].print(i);
		}

		System.out.println("\nPrint complete. Returning to the main menu...");
	}

	// MUSIC PRINT
	private static void printMusic() {
		System.out.println("\n========== Music ==========");
		System.out.println("\nRock Music:");

		for (int i = 0; i < mRockCount; i++) {
			mRock[i].print(i);
		}

		System.out.println("\nLatest Music:");

		for (int i = 0; i < mLatestCount; i++) {
			mLatest[i].print(i);
		}

		System.out.println("\nClassic Music:");

		for (int i = 0; i < mClassicCount; i++) {
			mClassic[i].print(i);
		}

		System.out.println("\nPrint complete. Returning to the main menu...");
	}

	private static void printStationery() {
		System.out.println("\n========== Stationery ==========");
		System.out.println("\nEraser:");

		for (int i = 0; i < sEraserCount; i++) {
			sEraser[i].print(i);
		}

		System.out.println("\nPen:");

		for (int i = 0; i < sPenCount; i++) {
			sPen[i].print(i);
		}

		System.out.println("\nPencil:");

		for (int i = 0; i < sPencilCount; i++) {
			sPencil[i].print(i);
		}

		System.out.println("\nStapler:");

		for (int i = 0; i < sStaplerCount; i++) {
			sStapler[i].print(i);
		}

		System.out.println("\nPrint complete. Returning to the main menu...");
	}

	// BOOK PRINT
	private static void printBook() {
		System.out.println("\n========== Book ==========");
		System.out.println("\nComic Books:");

		for (int i = 0; i < bComicCount; i++) {
			bComic[i].print(i);
		}

		System.out.println("\nSciFi Books:");

		for (int i = 0; i < bSciFiCount; i++) {
			bSciFi[i].print(i);
		}

		System.out.println("\nICT Books:");

		for (int i = 0; i < bICTCount; i++) {
			bICT[i].print(i);
		}

		System.out.println("\nPrint complete. Returning to the main menu...");
	}

	// PURCHASE SECTION
	// PURCHASE HARDWARE
	private static int[] searchProduct() {

		input = new Scanner(System.in);

		int hardwareOption = 0;
		int[] i = new int[3];
		while (true) {
			System.out.println("\n1) Input Device");
			System.out.println("2) Output Device");
			System.out.println("3) Processors");
			System.out.println("4) Storages\n");
			System.out.print("Please enter the type of the computer hardware you're looking for: ");

			hardwareOption = Integer.parseInt(input.nextLine());

			switch (hardwareOption) {
			case 1:
				i = new int[] { 1, searchInputDevice() };
				break;

			case 2:
				i = new int[] { 2, searchOutputDevice() };
				break;

			case 3:
				i = new int[] { 3, searchProcessors() };
				break;
			case 4:
				i = new int[] { 4, searchStorage() };
				break;

			default:
				System.out.println("Type of computer hardware not found. Returning to menu~\n.");
				break;
			}

			if (i[1] != -1) {
				return i;
			}
		}
	}

	private static int searchInputDevice() {
		String hardwareName;

		System.out.print("Enter the name of the input device: ");
		hardwareName = input.next();

		for (int i = 0; i < productInputCount; i++) {
			if (productInput[i].gethardwareName().equals(hardwareName)) {
				return i;
			}

		}

		System.out.println("Product not found. Returning to menu~\n.");
		return -1;
	}

	private static int searchOutputDevice() {
		String hardwareName;

		System.out.print("Enter the name of the output device: ");
		hardwareName = input.nextLine();

		for (int i = 0; i < productOutputCount; i++) {
			if (productOutput[i].gethardwareName().equals(hardwareName)) {
				return i;
			}

		}

		System.out.println("Product not found. Returning to menu~\n");
		return -1;
	}

	private static int searchProcessors() {
		String hardwareName;

		System.out.print("Enter the name of the processor: ");
		hardwareName = input.nextLine();

		for (int i = 0; i < productProcCount; i++) {
			if (productProc[i].gethardwareName().equals(hardwareName)) {
				return i;
			}

		}

		System.out.println("Product not found. Returning to menu~\n.");
		return -1;
	}

	private static int searchStorage() {
		String hardwareName;

		System.out.print("Enter the name of the storage: ");
		hardwareName = input.nextLine();

		for (int i = 0; i < productStorCount; i++) {
			if (productStor[i].gethardwareName().equals(hardwareName)) {
				return i;
			}

		}

		System.out.println("Product not found. Returning to menu~\n.");
		return -1;
	}

	private static void purchaseHardware() {
		int[] i = searchProduct();

		switch (i[0]) {
		case 1:
			productInput[i[1]].purchaseHardware();
			break;

		case 2:
			productOutput[i[1]].purchaseHardware();
			break;

		case 3:
			productProc[i[1]].purchaseHardware();
			break;

		case 4:
			productStor[i[1]].purchaseHardware();
			break;

		}
	}

}