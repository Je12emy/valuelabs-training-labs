package core_java_assesment_1;

import java.util.Scanner;

public class BankCompareMenu {

	public static Scanner sc = new Scanner(System.in);
	public static BankLoan[] banks = new BankLoan[2];

	public static void App() {
		Boolean run = true;

		do {
			printHR();
			System.out.println("*   Bank Compare   *");
			printHR();

			System.out.println("1. Use the default values.");
			System.out.println("2. Use custom values.");
			System.out.println("3. Exit");
			System.out.print("Please select an option: ");

			int appMode;
			appMode = Integer.valueOf(sc.nextLine());

			switch (appMode) {
			case 1:
				useDefaults();
				continue;
			case 2:
				customValuesMenu();
				continue;
			case 3:
				run = false;
				System.out.println("Exiting application....");
				System.out.println("Thank you!");
				break;
			default:
				continue;
			}

		} while (run);
	}

	private static void printHR() {
		System.out.println("********************");
	}

	private static void customValuesMenu() {

		Boolean run = true;
		double loan;

		do {

			System.out.print("Please enter the loan ammount: ");
			try {
				// Get loan amount
				loan = Double.valueOf(sc.nextLine());

				if (isValidLoan(loan)) {
					System.out.println();
					// Get years
					double years;
					System.out.print("Please enter the ammount of years:  ");
					years = Double.valueOf(sc.nextLine());

					if (isValidTime(years)) {
						System.out.println();

						for (int i = 0; i < 2; i++) {
							int n = 0;
							// ternary for displaying bank
							System.out.print("Please enter the number of slabs for Bank " + (i == 0 ? "A" : "B") + ":");
							// TODO validate input
							n = Integer.valueOf(sc.nextLine());

							if (isValidSlabAmmount(n)) {
								banks[i] = new BankLoan(loan, years, n);
								for (int j = 0; j < n; j++) {
									String[] slabInput;
									double period;
									double interestRate;
									System.out.print("Please enter the period and monthly interest rate for slab "
											+ (j + 1) + " ex: 5 9.5");
									slabInput = sc.nextLine().split(" ");

									period = Double.parseDouble(slabInput[0]);
									interestRate = Double.parseDouble(slabInput[1]);

									BankLoan.LoanPeriod loanPeriod = new BankLoan.LoanPeriod(interestRate, period,
											loan);
									banks[i].addPeriod(loanPeriod);
								}
								banks[i].calculateTotalEMI();

							} else {
								throw new InvalidValueExeption(n + "is not a valid ammount of slabs.");
							}

						}

						if (banks[0].getTotalEmi() > banks[1].getTotalEmi()) {
							System.out.println("Bank B");
						} else {
							System.out.println("Ban A");
						}

						run = false;

					} else {
						throw new InvalidValueExeption(years + " is not an allowed value");
					}

				} else {
					throw new InvalidValueExeption(loan + "is not a allowed value");
				}

			} catch (NumberFormatException e) {
				System.out.println("You tried using a invalid value, please try again.");
			} catch (NullPointerException e) {
				System.out.println("Please enter a value");
			} catch (InvalidValueExeption e) {
				System.out.println(e.getMessage());
			} finally {
				run = false;
			}
		} while (run);

	}

	private static Boolean isValidLoan(double loan) {
		return (1 <= loan) && (loan <= 1000000);
	}

	private static Boolean isValidTime(double years) {
		return (1 <= years) && (years <= 50);
	}

	private static Boolean isValidSlabAmmount(double time) {
		return (1 <= time) && (time <= 30);
	}

	private static void useDefaults() {
		BankLoan bankA = new BankLoan(10000, 20, 3);
		BankLoan.LoanPeriod loan1 = new BankLoan.LoanPeriod(9.5, 5, bankA.getLoanAmmount());
		BankLoan.LoanPeriod loan2 = new BankLoan.LoanPeriod(9.6, 10, bankA.getLoanAmmount());
		BankLoan.LoanPeriod loan3 = new BankLoan.LoanPeriod(8.5, 5, bankA.getLoanAmmount());

		bankA.addPeriod(loan1);
		bankA.addPeriod(loan2);
		bankA.addPeriod(loan3);

		bankA.calculateTotalEMI();

		BankLoan bankB = new BankLoan(10000, 20, 3);
		BankLoan.LoanPeriod loanb1 = new BankLoan.LoanPeriod(6.9, 10, bankB.getLoanAmmount());
		BankLoan.LoanPeriod loanb2 = new BankLoan.LoanPeriod(8.5, 5, bankB.getLoanAmmount());
		BankLoan.LoanPeriod loanb3 = new BankLoan.LoanPeriod(7.9, 5, bankB.getLoanAmmount());

		bankB.addPeriod(loanb1);
		bankB.addPeriod(loanb2);
		bankB.addPeriod(loanb3);

		bankB.calculateTotalEMI();

		/*
		 * 
		 * 
		 * System.out.println(bankA.getTotalEmi());
		 * System.out.println(bankB.getTotalEmi());
		 * 
		 */

		// *******************

		BankLoan bank2A = new BankLoan(50000, 26, 3);
		BankLoan.LoanPeriod loan2a1 = new BankLoan.LoanPeriod(9.5, 13, bank2A.getLoanAmmount());
		BankLoan.LoanPeriod loan2a2 = new BankLoan.LoanPeriod(6.9, 3, bank2A.getLoanAmmount());
		BankLoan.LoanPeriod loan2a3 = new BankLoan.LoanPeriod(5.6, 10, bank2A.getLoanAmmount());

		bank2A.addPeriod(loan2a1);
		bank2A.addPeriod(loan2a2);
		bank2A.addPeriod(loan2a3);

		bank2A.calculateTotalEMI();

		BankLoan bank2B = new BankLoan(50000, 26, 3);
		BankLoan.LoanPeriod loan2b1 = new BankLoan.LoanPeriod(8.5, 14, bank2B.getLoanAmmount());
		BankLoan.LoanPeriod loan2b2 = new BankLoan.LoanPeriod(7.4, 6, bank2B.getLoanAmmount());
		BankLoan.LoanPeriod loan2b3 = new BankLoan.LoanPeriod(9.6, 6, bank2B.getLoanAmmount());

		bank2B.addPeriod(loan2b1);
		bank2B.addPeriod(loan2b2);
		bank2B.addPeriod(loan2b3);

		bank2B.calculateTotalEMI();

		/*
		 * System.out.println(bank2A.getTotalEmi());
		 * System.out.println(bank2B.getTotalEmi());
		 */

		System.out.println();
		System.out.println();
		printHR();
		System.out.println("Fist default case:");
		printHR();
		if (bankA.getTotalEmi() > bankB.getTotalEmi()) {
			System.out.println("Bank B");
		} else {
			System.out.println("Bank A");
		}
		printHR();
		System.out.println();
		System.out.println("Seccond default case:");
		printHR();
		if (bank2A.getTotalEmi() > bank2B.getTotalEmi()) {
			System.out.println("Bank B");
		} else {
			System.out.println("Bank A");
		}
		printHR();
		System.out.println();
		System.out.println();
	}
}
