package pjatk;

public class Main {

    public static void main(String[] args) {

    	AccountServiceImpl asi1 = new AccountServiceImpl();

    	User John1 = new User(1, "A", "B");
    	User John2 = new User(2, "A", "B");
    	User John3 = new User(3, "A", "B");
    	User John4 = new User(4, "A", "B");
    	User John5 = new User(5, "A", "B");


    	asi1.addAccount(1, 100, John1);
    	asi1.addAccount(2, 200, John2);
    	asi1.addAccount(3, 300, John3);
    	asi1.addAccount(4, 400, John4);
    	asi1.addAccount(5, 500, John5);

    	System.out.println(asi1.countAccountsWithBalanceGreaterThan(300));

		System.out.println(asi1.findAccountByOwnerId(2));
		System.out.println(asi1.findAccountByOwnerId(4));


	}


}
