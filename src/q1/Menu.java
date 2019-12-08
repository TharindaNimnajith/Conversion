package q1;

import java.util.Scanner;

public class Menu {
	private int option;

	public Menu() {
		displayConversionSubMenu();
	}

	public void displayConversionSubMenu() {
		System.out.println("--- CONVERSION SUB MENU --- \n");
		System.out.println("1. Grams To Ounces");
		System.out.println("2. Ounces To Grams");
		System.out.println("3. Kilograms To Stones");
		System.out.println("4. Stones To Kilograms");
		System.out.println("5. Pounds To Grams");
		System.out.println("6. Grams To Pounds");
		System.out.println("0. Exit \n");

		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Select an Option: ");
		option = keyboardInput.nextInt();

		Conversion conversion1 = new Conversion();
		
		double weight;

		switch (option) {
			case 1 : System.out.print("\nEnter the Weight in Grams: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Grams = " + conversion1.GramsToOunces(weight) + " Ounces \n\n");
					 break;
			case 2 : System.out.print("\nEnter the Weight in Ounces: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Ounces = " + conversion1.OunToGrams(weight) + " Grams \n\n");
					 break;
			case 3 : System.out.print("\nEnter the Weight in Kilograms: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Kilograms = " + conversion1.KgToStone(weight) + " Stones \n\n");
					 break;
			case 4 : System.out.print("\nEnter the Weight in Stones: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Stones = " + conversion1.StoneToKg(weight) + " Kilograms \n\n");
					 break;
			case 5 : System.out.print("\nEnter the Weight in Pounds: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Pounds = " + conversion1.PoundsToGram(weight) + " Grams \n\n");
					 break;
			case 6 : System.out.print("\nEnter the Weight in Grams: ");
					 weight = keyboardInput.nextDouble();
					 System.out.println("\n" + weight + " Grams = " + conversion1.GramToPound(weight) + " Pounds \n\n");
					 break;
			case 0 : System.exit(0);
					 break;
			default: System.out.println("\nInvalid Input! Please Try Again... \n\n");
					 displayConversionSubMenu();
		}

		displayConversionSubMenu();
	}
}
