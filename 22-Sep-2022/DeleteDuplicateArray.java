/*
Writing a Program That Sorting & then Delete the Duplicate Number.
Subham Amin.
22-09-2022
*/
//Imrporting Extention.
import java.util.Scanner;
import java.util.Arrays;
class DeleteDuplicateArray //Declearing Class.
{
	static void inputArray() //Declearing Static.
	{
		Scanner sc= new Scanner(System.in); //Scanner Input.
		System.out.println("Enter the range of the number:");//Print For scan.
		int rows= sc.nextInt();//Taking Input.
		int arr[]= new int[rows];
		System.out.println("Enter the Numbers below");//Printing for Numbers Scan.
		for(int i=0;i<rows;i++)
		{
				arr[i]= sc.nextInt();	
		}
        Arrays.sort(arr); // Shorting the Numbers.		
		System.out.println();
		System.out.println("The Numbers are:"); // Printing the Numbers as per input.
		displayArray(arr); // Displaying Numbers.
		System.out.println(); //Taking New Line.
		System.out.println("Removed Duplicate Entries:");
        removeDuplicate(arr);	
	}
	static void displayArray(int myArray[])
	{	
	   System.out.println();
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");			
		}
	}
   static void removeDuplicate(int myArray[])
   {
	   int size= myArray.length;
	   int new_size;
	   if(size==0||size==1)
		   new_size=size;
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			   temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   //Changing original Numbers.
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   //Printing after removing duplicate entries.
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(myArray[i]+"  ");
	   }
   }
   public static void main(String ...args)
  {//Starting Public.
     inputArray();//Calling Input Array.
  }//Ending Public.
} //End of Class. 