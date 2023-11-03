import java.util.Scanner;
class Searching
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      int a[]=new int[10];
         for(int i=0;i<a.length;i++)
           {
             a[i]=vikas.nextInt();
             
           }
       System.out.println("Enter the index want to search element");
      int in=vikas.nextInt();
      for(int i=0;i<a.length;i++)
        {
          if(i==in)
          {
            System.out.println("Element in the given index is" +a[i]);
           }
         
         else
          {
            System.out.println("Element not found give correct index ");
            }
        }

       
     }
  }