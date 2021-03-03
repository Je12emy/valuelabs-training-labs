package core_java_assesment_1;

import java.util.ArrayList;

public class BankLoan {
	private double loanAmmount;
	private double totalYears;
	private double numberOfSlabs;
	private double totalEmi;
	private ArrayList<LoanPeriod> loanPeriods = new ArrayList<>();

	public BankLoan(double loanAmmount, double totalYears, double numberOfSlabs) {
		super();
		this.loanAmmount = loanAmmount;
		this.totalYears = totalYears;
		this.numberOfSlabs = numberOfSlabs;
	}

	public double getLoanAmmount() {
		return loanAmmount;
	}


	public void addPeriod(LoanPeriod period) {
		loanPeriods.add(period);
	}

	public void calculateTotalEMI() {
		loanPeriods.forEach(period -> {
			totalEmi += period.emi;
		});
	}

	public double getTotalEmi() {
		return totalEmi;
	}

	public void setTotalEmi(double totalEmi) {
		this.totalEmi = totalEmi;
	}

	public static class LoanPeriod {
		private double emi;
		private double monthlyInterestRate;
		private double numberOfYears;

		public LoanPeriod(double monthlyInterestRate, double period, double loanAmmount) {
			super();
			this.monthlyInterestRate = monthlyInterestRate;
			this.numberOfYears = period;
			setEmi(loanAmmount);
		}

		public double getEmi() {
			return emi;
		}

		public void setEmi(double loanAmmount) {
			emi = loanAmmount * monthlyInterestRate
					/ (1 - 1 / (1 + Math.pow(monthlyInterestRate, (numberOfYears * 12))));
		}

		public double getMonthlyInterestRate() {
			return monthlyInterestRate;
		}

		public void setMonthlyInterestRate(double monthlyInterestRate) {
			this.monthlyInterestRate = monthlyInterestRate;
		}

		public double getNumberOfYears() {
			return numberOfYears;
		}

		public void setNumberOfYears(int numberOfYears) {
			this.numberOfYears = numberOfYears;
		}

	}
}
