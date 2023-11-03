/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array 
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 

*/

import java.util.Scanner;

public class TwoDimentionalArray {

public static void main(String args[]) {
    Scanner add = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int row = add.nextInt();
    System.out.println("Enter the size of coloumn");
    int col = add.nextInt();
    int a[][] = new int[row][col];
    System.out.println("Enter the array elements");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        a[i][j] = add.nextInt();
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    int max = a[0][0];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (max < a[i][j])
        {
          max = a[i][j];
  
        }
      }
     }
   System.out.print("The largest element is :"+max);

  }
}
