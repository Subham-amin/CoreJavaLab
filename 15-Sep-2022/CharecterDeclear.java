/*
Writing a Program to print the Charecter whether it is Vowel,Consonant,Number or a Special Charecter.
*/
class CharecterDeclear //Declearing Class
{
	static void printChar(char charValue) //Declearing Methode
	{
		int asciiValue=charValue; //Declearing asciiValue
		if (((asciiValue>=65)&&(asciiValue<=90))||(asciiValue>=97)&&(asciiValue<=122)) //Condition for Alphabets.
		{
			if ((charValue=='A')||(charValue=='E')||(charValue=='I')||(charValue=='O')||(charValue=='U')||(charValue=='a')||(charValue=='e')||(charValue=='i')||(charValue=='o')||(charValue=='u')) // Condition for Vowels.
			{
				System.out.println(" It is Alphabet & it is Vowel"); //Printing Vowels Result.
			}//Ending Inner If.
			else //Condition for Consonant Alphabets
			{
				System.out.println(" It is Alphabet & It is Consonant"); //Printing Consonant Alphabets
			}//Ending Inner Else.
		}//Ending If Condition.
		else if ((asciiValue>=48)&&(asciiValue<=57))//Codition for Number.
		{
			System.out.println(" It is a Number");//Printing as Number result.
		}
		else//condition for special charecter.
		{
			System.out.println(" It is a Special Charecter");//Printing Special Charecter
		}
		
	}
		
		public static void main(String... args) //Calling Main.
		{  //Calling Main
		char value=args[0].charAt(0);//taking input from User.
		printChar(value);//calling Methode.
		}  // Ending Main
} // Ending Class