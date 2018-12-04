import java.text.NumberFormat;

public class BankAccount {

	//fields 
	String name;
	private double balance;
	private double fee = 0.00;
	
	// constructor 1 sets account balance and fee to zero 	
	public BankAccount(String name, double balance, double fee){
		
		if(name == null || balance < 0 || fee < 0) {
			throw new IllegalArgumentException();
		}
		
		this.name = name;
		this.balance = balance;
		this.fee = fee;
	}
	
	// creates deposits
	public void deposit(double amount) {
		
		//throwing exceptions if amount being deposit is negative.
		if(amount < 0) {
			throw new IllegalArgumentException();
		}
		// adjusting the balance
		balance = balance + amount;
	}
	
	//changes the balance for withdrawals
	public void withdraw(double amount) {
		// throwing exceptions if amount being withdrawn is negative.
		if(amount < 0) {
			throw new IllegalArgumentException();
		}
		
		// creating variable for the total of the amount and transaction fee
		double deduction = amount + fee;
		// checking to make sure there is enough money in the account. 
		if(balance > deduction) {
			balance = balance - deduction;
		}
		// we're supposed to do nothing if there isn't but I wanted to add this
		/*else {
			throw new IllegalArgumentException();
		}*/

	}
	
	// creates a string representation of the object
	public String toString() {
		
		return(name + ", " + getBalanceFormatted());
	}
	
	public String getBalanceFormatted(){
		String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
		return formattedBalance;
	}
	 
	// Setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
}
