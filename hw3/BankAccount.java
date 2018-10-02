import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount>{
	private double balance;

	public BankAccount(double initialBalance) {
		balance = initialBalance;

	}

	public double getBalance() {
		return balance;
	}

	public int compareTo(BankAccount temp) {
		if (balance < temp.balance)
			return -1;
		
		if (balance == temp.balance)
			return 0;
		
		return 1;
	}


	public static void main(String[] args) {
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();

		BankAccount bAccount1 = new BankAccount(500); 
		BankAccount bAccount2 = new BankAccount(10000);
		BankAccount bAccount3 = new BankAccount(400);
		BankAccount bAccount4 = new BankAccount(0);
		BankAccount bAccount5 = new BankAccount(50);

		list.add(bAccount1);
		list.add(bAccount2);
		list.add(bAccount3);
		list.add(bAccount4);
		list.add(bAccount5);

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}
	}
}
