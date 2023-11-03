import java.util.Scanner;
class NegElement
  {
    public static void main(String args[])
    {
     Scanner vikas=new Scanner(System.in);
      int a[]=new int[10];
       System.out.println("Enter Negative numbers");
      for(int i=0;i<a.length;i++) 
         {
           a[i]=vikas.nextInt();
         }
         for(int i=0;i<a.length;i++)
           {
           if(a[i]<0)
           {
             System.out.println("Negative numbers are :"+a[i]);
           }
           }
         
         
      
    }
  }
  