/*
Program for Division with remainder output
*/

//decalraing a class
class Quotient
{
	//calling main
  public static void main(String[] args)
  {
	  
	  int num1= Integer.parseInt(args[0]); //taking input1
	  int num2= Integer.parseInt(args[1]); //taking input2 
	 System.out.println("Your Division is");
	 System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));//Printing Division output. 
	 System.out.println("Your Remeinder is");
	 System.out.println(Integer.parseInt(args[0])%Integer.parseInt(args[1]));//Printing remeinedr output.
	 

	 
  }
 // end of main

}
// end of class
