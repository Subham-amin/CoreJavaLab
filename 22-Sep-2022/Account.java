class Account //Declearing Class.
{
	private String accountName;//Taking String as Name.
	private String accountType;//Taking String as Type.
	private double accountBalance;//Taking Double as Balance.
	
	Account()//Default constructor.
	{
		
	}
	//Parameterized Constructor.
	Account(String accountName,String accountType,double accountBalance)
	{
		this.accountName=accountName;//Declearing Account Name.
		this.accountType=accountType;//Declearing Account Type.
		this.accountBalance=accountBalance;//Declearing Account Balance.
	}
	//Gretter and Setter.
	String getaccountName()
	{
		return this.accountName;
	}
	void setaccountName(String accountName)
	{
		this.accountName=accountName;
	}
	String getaccountType()
	{
		return this.accountType;
	}
	void setaccountType(String accountType)
	{
		this.accountType=accountType;
	}
	double getaccountBalance()
	{
		return this.accountBalance;
	}
	void setaccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	
}//End of Class.