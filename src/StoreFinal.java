import java.text.DecimalFormat;
import java.util.Scanner;
import Software.*;
import Books.*;
import ComputerHardware.*;
import Music.*;

public class StoreFinal {
	static Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {

		int option = 0;
		int viewOption = 0;

		System.out.println("========== Main Menu ==========");
		System.out.println("1) View product type");
		System.out.println("2) Purchase a product");
		System.out.println("3) View Cart");
		System.out.println("4) Exit");

		while(true) {
			
			System.out.print("Selection: ");
			option = input.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("\nPlease select the type of product you want to look for");
				printProductType();
				System.out.println("Selection: ");
				viewOption = input.nextInt();
				break;
			case 2:
				System.out.println("\nPlease select the type of product");
				printProductType();
				System.out.println("Selection: ");
				break;
			case 3:
				System.out.println("Cart: ");
				break;
			case 4:
				System.out.println("Exiting... Goodbye!");
				return;
			default:
				System.out.println("That is not a valid option");
				break;
			}
		}
	}

	public static void printProductType() {

		System.out.println("1) Computer Hardware");
		System.out.println("2) Software");
		System.out.println("3) Music");
		System.out.println("4) Stationeries");
		System.out.println("5) DVD");
		System.out.println("6) Back");
	}
}
