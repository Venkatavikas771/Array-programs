import java.util.Scanner;
class TwoDAdd
  {
    public static void main(String args[])
    {
      Scanner add=new Scanner(System.in);
    
      System.out.println("Enter the size of row of matrix ");
      int row=add.nextInt();
       System.out.println("Enter the size of coloumn of matrix ");
      int col=add.nextInt();
       
      System.out.println("Enter the array elements of matrix 1");
      int a1[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
             {
             a1[i][j]=add.nextInt();
             }
        }
      System.out.println("Enter the array elements of matrix 2");
      int a2[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
             {
             a2[i][j]=add.nextInt();
             }
        }
       
       for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
             {
    System.out.print(+a1[i][j]+a2[i][j]+" ");
             }
           System.OUT.println();
        }
      
    }
  }  