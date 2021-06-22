// create Objects,Methods and Constractions, call methods from inside other methods

package Lesson5;

class BankAccountsfileds {
	int id;
	String name;
	double balance;
	int id2;

	void showIt() {
		System.out.println("showing accounts : " + id + name + balance);
	}

}

public class BankAccouts {
	public static void main(String[] args) {

		BankAccountsfileds MyAccount = new BankAccountsfileds();
		BankAccountsfileds YourAccount = new BankAccountsfileds();
		BankAccountsfileds HisAccout = new BankAccountsfileds();

		MyAccount.id = 1;
		MyAccount.name = "Valentyn";
		MyAccount.balance = 75.45;

		YourAccount.id = 2;
		YourAccount.name = "Ivan";
		YourAccount.balance = 12.14;

		HisAccout.id = 3;
		HisAccout.name = "Igor";
		HisAccout.balance = 34.43;

		MyAccount.showIt();
		YourAccount.showIt();
		HisAccout.showIt();

	}
}
