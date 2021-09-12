package lab;

public class Test{

    public static void main(String[] args) {
    	
    	Account newAccount = new Account(1122,20000.00,4.5);
    	
    	newAccount.withdraw(2500);
    	newAccount.deposit(3000);
    	
    	System.out.println(newAccount.getBalance());
    	System.out.println(newAccount.getMonthlyInterest());
    	System.out.println(newAccount.getDateCreated());
    	
    }

}
