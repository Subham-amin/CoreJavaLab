
/*
Write a Program Student and create an array of 10 students and display the students whose marks are more than 90%.
Subham Amin.
22-09-2022
 */
import java.util.*;
class StudentsArray 
{
    // Declearing Main method.
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);// Taking input from user
        int n=10; // Declaring range of n is 10.
        int arr[] = new int[n];// Declaring the array.
        System.out.println("Enter the all 10 Students Percentage of Marks  ");//Printing for Input.
        for (int i = 0; i < n; i++) // Initialize the array
        {
            arr[i] = sc.nextInt();
        }
        // Calculate the total Marks
        for (int i = 0; i < n; i++) //Condition for loop.
		{//Starting Loop.
            if (arr[i] >= 90) 
			{
                System.out.println(" Displaying Marks That More Than 90% Achived  " + arr[i]);
            }
        }//End of for loop.
    }//End of Method.
}//End Of Class.
