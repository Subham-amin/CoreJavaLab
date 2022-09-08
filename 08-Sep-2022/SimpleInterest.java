

/*Simple Interest
Writing a program to know Simple interest.
*/

//Declaring Class 
class SimpleInterest
{
	
	//Calling Main.
public static void main(String[] args)
{
	int num1= Integer.parseInt(args[0]); //taking Principal
	int num2= Integer.parseInt(args[1]); //taking Rate of interest
	//Taking 5 years for time.
	System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[1])*(5)/100);//Printing Simple Interest. 
}

//End of Main

}
//End of Class