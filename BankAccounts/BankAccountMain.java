
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount yana = new BankAccount("Yana",0,2.46);
		
		yana.deposit(100.00);
		yana.withdraw(22.50);
		System.out.println(yana.getName() + "'s account balance is " + yana.getBalance());
		System.out.println(yana.toString());
		
		yana.withdraw(76.00);
		
		System.out.println(yana.toString());
	}

}
