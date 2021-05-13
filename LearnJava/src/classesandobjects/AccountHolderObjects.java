package classesandobjects;


public class AccountHolderObjects {
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();

		tom.firstName = "Tom";
		tom.lastname = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Tom credit card situation is:" +tom.eligibleForCreditCard);
		
		henry.firstName = "Henry";
		henry.lastname = "Jason";
		henry.age = 27;
		henry.accountBalance = 20000;
		henry.testEligibilityForCreditCard();
		System.out.println("Henry credit card situation is: "+henry.eligibleForCreditCard);

	}
}
