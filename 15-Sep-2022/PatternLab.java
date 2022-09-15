/* Writing a Program To Print a Pattern.
     *
	* *
   * * *
  * * * *
  
 */
  
class PatternLab // Taking Class.
 {

	static void PatternLab(int noOfRows) //Starting Methode
	{
		int j,k; // Taking Integers j,k.
		for(int i=1;i<=noOfRows;i++) //taking integer i with value of user given as input.
		{
			
		for(i=1;i<=noOfRows;i++)//outer loop
		{
			for(j=noOfRows;j>i;j--)//Inner loop for space print
			{
				System.out.print(" ");//Printing Spaces for inner loop
			}
			for(k=1;k<=i;k++)// loop for star print
			{
				System.out.print("* ");// Printing Stars as per Condition
			}
			System.out.println(); //Taking New line in after every loop condition completed
			}
			}
			}
	public static void main(String[] args) // CAlling Main.
		{
			int number = Integer.parseInt(args[0]); // Taking Input from users how many rows should be taken.
			PatternLab(number); // Calling Methode.

	} // Ending Main.

} // Ending Class.