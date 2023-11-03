/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String args[]) {
    int original[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

    int transpose[][] = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        transpose[i][j] = original[j][i];
      }
    }

    System.out.println("Printing Matrix without transpose:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(original[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Printing Matrix After Transpose:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}
