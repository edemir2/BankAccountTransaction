import javax.crypto.spec.ChaCha20ParameterSpec;

class demir_BankAccount
{
	private final String ownerLastName;		//| `final` |  The field cannot have it's value changed once it is set |
	private final String ownerFirstName;	
	private final String accountNumber;		// additional note: final classes do not allow subclasses
	private double checkingBalance;		//only code within the class can access
	private double savingsBalance;		//Why we are not using static here as well?
	private static int bankAccountCount = 0;  //| `static` | The same copy of the field is used by all copies of the class versus each instance having it's own copy |
	
	/**
	 * Value constructor for BankAccount.
	 * Constructs a bank account with all the acount information initialized based upon the values specified.
	 * 
	 * A unique account number is made via a delegate call to the makeAccountNumber() helper function.
	 * 
	 * @param String ownerLastName 		- the account owner's last name	 
	 * @param String ownerFirstName 	- the account owner's first name
	 * @param double checkingBalance 	- the starting checking balance
	 * @param double savingsBalance 	- the starting savings balance
	 */ 
	demir_BankAccount(String ownerLastName, String ownerFirstName, double checkingBalance, double savingsBalance)
	{
		this.ownerLastName = ownerLastName;
		this.ownerFirstName = ownerFirstName;
		this.accountNumber = makeAccountNumber();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		
		bankAccountCount = bankAccountCount+1;
	}
	
	/**
	 * Another value constructor for BankAcount.
	 * Constructs a bank account with the specified first and last name for the owner. 
	 * The starting balances for the checking and savings account will be initialized to be zero.
	 * 
	 * @param String ownerLastName 	- the account owner's last name  
	 * @param String ownerFirstName - the account owner's first name
	 */ 
	demir_BankAccount(String ownerLastName, String ownerFirstName)
	{
		this(ownerLastName, ownerFirstName, 0.0, 0.0);
	}
	
	/**
	 * Attempts to withdraw the specified amount from the checking balance.
	 * The checking balance is only withdrawn from if there are sufficient funds to make the withdrawal.
	 * 
	 * Returns true if there are sufficient funds to make the withdrawal.
	 * Returns false if there are insufficient funds to make the withdrawal.
	 * 
	 * @param double amount - the amount to attempt to withdraw from the checking balance
	 * @return 				- whether the withdrawal was successful 
	 */ 
	public boolean withdrawFromChecking(double amount)
	{
		boolean successful = false;
		
		if(amount <= checkingBalance && amount>0)
		{
			checkingBalance -= amount;
			successful = true;
		}

		return successful;
	}
	
	/**
	 * Attempts to withdraw the specified amount from the savings balance.
	 * The savings balance is only withdrawn from if there are sufficient funds to make the withdrawal.
	 * 
	 * Returns true if there are sufficient funds to make the withdrawal.
	 * Returns false if there are insufficient funds to make the withdrawal.
	 * 
	 * @param double amount - the amount to attempt to withdraw from the savings balance
	 * @return 				- whether the withdrawal was successful 
	 */ 
	public boolean withdrawFromSavings(double amount)
	{
		//TODO - implement
		boolean successful_Saving= false;
		
		if(amount <= savingsBalance && amount>0)
		{
			savingsBalance -= amount;
			successful_Saving = true;

		}
		return successful_Saving;
	}
	
	/**
	 * Attempts to transfer the specified amount from the savings balance to the checking balance.
	 * The savings balance is only transfered from if there are sufficient funds to make the transfer.
	 * 
	 * Returns true if there are sufficient funds to make the transfer.
	 * Returns false if there are insufficient funds to make the transfer.
	 * 
	 * @param double amount - the amount to attempt to transfer from the savings balance to the checking balance
	 * @return 				- whether the transfer was successful 
	 */ 
	public boolean transferFromSavingsToChecking(double amount)
	{
		//TODO - implement
		boolean successful_Saving_to_Checking= false;
		
		if(amount <= savingsBalance && amount>0)
		{
			savingsBalance -= amount;
			checkingBalance+=amount;
			successful_Saving_to_Checking = true;
			


		}
		return successful_Saving_to_Checking;
	}
	
	/**
	 * Attempts to transfer the specified amount from the checking balance to the savings balance.
	 * The checking balance is only transfered from if there are sufficient funds to make the transfer.
	 * 
	 * Returns true if there are sufficient funds to make the transfer.
	 * Returns false if there are insufficient funds to make the transfer.
	 * 
	 * @param double amount - the amount to attempt to transfer from the checking balance to the savings balance
	 * @return 				- whether the transfer was successful 
	 */ 
	public boolean transferFromCheckingToSavings(double amount)
	{
		//TODO - implement
		boolean successful_Checking_to_Saving= false;
		
		if(amount <= checkingBalance && amount>0)
		{
			checkingBalance -= amount;
			savingsBalance += amount;
			successful_Checking_to_Saving = true;
			

		}
		return successful_Checking_to_Saving;
	}

	/**
	 * Deposits the specified amount to the checking balance.
	 * 
	 * @param double amount - the amount to deposit into the checking balance
	 */ 
	public void depositToChecking(double amount)
	{
		//TODO - implement
		if(amount>0)
		{
		checkingBalance = checkingBalance+ amount;
		}
		

	}
	
	/**
	 * Deposits the specified amount to the savings balance.
	 * 
	 * @param double amount - the amount to deposit into the savings balance
	 */ 
	public void depositToSavings(double amount)
	{
		//TODO - implement
		if(amount>0)
		{
		savingsBalance= savingsBalance + amount;
		}
		

	}
	
	/**
	 * Constructs a string to represent the BankAccount object's current state.
	 * 
	 * @return a string representing the BankAccount
	 */ 
	@Override
	public String toString()
	{
		//TODO - implement
		String str = ownerLastName+", "+ownerFirstName+", "+accountNumber+"\n"+checkingBalance+"\n"+savingsBalance;
		return str;
	}
	
	/**
	 * Getter for the BankAccount owner's last name.
	 * 
	 * @return the owner's last name
	 */ 
	public String getOwnerLastName()
	{
		return ownerLastName;
	}
	
	/**
	 * Getter for the BankAccount owner's first name.
	 * 
	 * @return the owner's first name
	 */ 
	public String getOwnerFirstName()
	{
		return ownerFirstName;
	}
	
	/**
	 * Getter for the BankAccount's account number. 
	 * 
	 * @return the BankAccount's account number
	 */ 
	public String getAccountNumber()
	{
		//TODO - implement
		return accountNumber;
	}
	
	/**
	 * Getter for the BankAccount's checking balance.
	 * 
	 * @return the BankAccount's checking balance
	 */ 
	public double getCheckingBalance()
	{
		//TODO - implement

		return checkingBalance;
	}
	
	/**
	 * Getter for the BankAccount's savings balance.
	 * 
	 * @return the BankAccount's savings balance
	 */ 
	public double getSavingsBalance()
	{
		//TODO - implement
		return savingsBalance;
	}
	
	/**
	 * Private helper method that is used to make an account number for each BankAccount
	 * that gets constructed.
	 * 
	 * @return the account number of the BankAccount
	 */ 
	private String makeAccountNumber()
	{
		String aNumber = "" + bankAccountCount;
		
		while( aNumber.length() < 6 )
		{
			aNumber = "0" + aNumber;
		}
		return aNumber;
	}
	
	/**
	 * Returns how many BankAccount objects have been constructed.
	 * 
	 * @return the total number of BankAccount objects that have been constructed.
	 */ 
	public static int getBankAccountCount()
	{
		return bankAccountCount;
	}
}
