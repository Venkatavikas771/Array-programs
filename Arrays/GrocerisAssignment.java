/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

public static void main(String args[])
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the size");
       int size= scanner.nextInt();
      System.out.println("Enter the expenses");
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
       int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
      }
       System.out.println("Max geocerie expense is:"+(max));
      
  }
  }