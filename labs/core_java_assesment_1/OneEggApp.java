package core_java_assesment_1;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import core_java_assesment_1.EggOrder.Egg;

public class OneEggApp {
	public static Scanner sc = new Scanner(System.in);

	public static void App() {

		boolean run = true;

		int mode;

		do {

			System.out.println("OneEgg.inc");
			System.out.println("1. Use default values.");
			System.out.println("2. Use custom values.");
			System.out.println("3. Exit");
			System.out.print("Please select an option:");
			mode = Integer.valueOf(sc.nextLine());

			switch (mode) {
			case 1:
				defaultValues();
				break;
			case 2:
				orderMenu();
				break;
			case 3:
				System.out.println("Exiting program...");
				System.out.println("Thank you!");
				run = false;
				break;
			default:
				continue;
			}

		} while (run);
	}

	public static void orderMenu() {
		int n;
		int amount;
		String input;
		String[] orderSlices;
		boolean run = true;

		do {
			try {
				System.out.print("Please enter the number of classes and order amount (5 150):");
				input = sc.nextLine();
				orderSlices = input.split(" ");

				n = Integer.parseInt(orderSlices[0]);
				
				System.out.println();
				
				if (n < 20 && n > 1) {
					amount = Integer.parseInt(orderSlices[1]);

					if (amount >= 1) {
						EggOrder order = new EggOrder(amount);

						for (int i = 0; i < n; i++) {
							int stock;
							System.out.print("Please enter the stock for egg class " + (i + 1) + " :");
							stock = Integer.valueOf(sc.nextLine());
							if (stock >= 1 ) {
								EggOrder.Egg eggClass = new Egg(stock);
								order.addEgg(eggClass);									
							} else {
								throw new InvalidValueExeption(stock + " is not a valid egg stock");
							}
							
						}
						System.out.println("Dispatching order:");
						order.dipatchOrder();
						System.out.println();
						run = false;

					} else {
						throw new InvalidValueExeption(amount + " is not a valid egg order");
					}

				} else {
					throw new InvalidValueExeption(n + " is not an allowed number for egg classes");
				}

			} catch (PatternSyntaxException e) {
				System.out.println("You entered and invalid order.");
			} catch (InvalidValueExeption e) {
				System.out.println(e.getMessage());
			} finally {
				continue;
			}

		} while (run);

	}

	public static void defaultValues() {
		// First input

		String orderInput = "5 150";
		int numClasses, orderAmount;

		try {
			// Get values for num of classes and order amount
			String[] orderSlices = orderInput.split(" ");
			numClasses = Integer.parseInt(orderSlices[0]);
			orderAmount = Integer.parseInt(orderSlices[1]);

			EggOrder.Egg egg1 = new EggOrder.Egg(50);
			EggOrder.Egg egg2 = new EggOrder.Egg(15);
			EggOrder.Egg egg3 = new EggOrder.Egg(80);
			EggOrder.Egg egg4 = new EggOrder.Egg(10);
			EggOrder.Egg egg5 = new EggOrder.Egg(5);

			EggOrder eggOrder = new EggOrder(orderAmount);

			eggOrder.addEgg(egg1);
			eggOrder.addEgg(egg2);
			eggOrder.addEgg(egg3);
			eggOrder.addEgg(egg4);
			eggOrder.addEgg(egg5);

			System.out.println("Order 1");
			eggOrder.dipatchOrder();

			orderInput = "4 250";
			orderSlices = orderInput.split(" ");
			numClasses = Integer.parseInt(orderSlices[0]);
			orderAmount = Integer.parseInt(orderSlices[1]);

			EggOrder.Egg eggb1 = new EggOrder.Egg(80);
			EggOrder.Egg eggb2 = new EggOrder.Egg(50);
			EggOrder.Egg eggb3 = new EggOrder.Egg(70);
			EggOrder.Egg eggb4 = new EggOrder.Egg(20);

			EggOrder eggOrderb = new EggOrder(orderAmount);

			eggOrderb.addEgg(eggb1);
			eggOrderb.addEgg(eggb2);
			eggOrderb.addEgg(eggb3);
			eggOrderb.addEgg(eggb4);

			System.out.println("Order 2");
			eggOrderb.dipatchOrder();
			System.out.println();
		} catch (NumberFormatException e) {
			System.out.println("A invalid input was given.");
		} catch (PatternSyntaxException e) {
			System.out.println("A invalid input was given for the order.");
		}

	}

}
