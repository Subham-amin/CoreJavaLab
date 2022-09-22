/*
Writing a Program That Shows the Bank Account Details.
Subham Amin.
22-09-2022
*/
class SBIBank//Declearing Class.
{
	public static void main(String ...args)//Declearing Method.
	{
		//Declearing Account Details.
		Account person1=new Account("Shuruti","Salary",56000.12);
		Account person2=new Account("Subham","Savings",900.22);
		Account person3=new Account("Royston","Savings",990.99);
		Account person4=new Account("Mritul","Current",1200.45);
		Account person5=new Account("Shweta","Savings",760.33);
		Account person6=new Account("Sweety","Current",920.26);
		Account person7=new Account("Aditya","Savings",13231.03);
		Account person8=new Account("Anmol","Current",1400.27);
		Account person9=new Account("Rakhee","Salary",561.22);
		Account person10=new Account("Mukul","Current",410.11);
		
		
		{
		//Printing Account Details.
		
		System.out.println(" The Account Holder Name is = "+person1.getaccountName());
		System.out.println(" The Account Type is = "+person1.getaccountType());
		System.out.println(" The Account Balance is = "+person1.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person2.getaccountName());
		System.out.println(" The Account Type is = "+person2.getaccountType());
		System.out.println(" The Account Balance is = "+person2.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person3.getaccountName());
		System.out.println(" The Account Type is = "+person3.getaccountType());
		System.out.println(" The Account Balance is = "+person3.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person4.getaccountName());
		System.out.println(" The Account Type is = "+person4.getaccountType());
		System.out.println(" The Account Balance is = "+person4.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person5.getaccountName());
		System.out.println(" The Account Type is = "+person5.getaccountType());
		System.out.println(" The Account Balance is = "+person5.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person6.getaccountName());
		System.out.println(" The Account Type is = "+person6.getaccountType());
		System.out.println(" The Account Balance is = "+person6.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person7.getaccountName());
		System.out.println(" The Account Type is = "+person7.getaccountType());
		System.out.println(" The Account Balance is = "+person7.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person8.getaccountName());
		System.out.println(" The Account Type is = "+person8.getaccountType());
		System.out.println(" The Account Balance is = "+person8.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person9.getaccountName());
		System.out.println(" The Account Type is = "+person9.getaccountType());
		System.out.println(" The Account Balance is = "+person9.getaccountBalance());
		System.out.println(" ----------****---------- ");
		System.out.println(" The Account Holder Name is = "+person10.getaccountName());
		System.out.println(" The Account Type is = "+person10.getaccountType());
		System.out.println(" The Account Balance is = "+person10.getaccountBalance());
		
		}
	
	}//End of Method.
}//End Of Class.