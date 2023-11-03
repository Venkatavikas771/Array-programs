
import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
     Scanner vikas=new Scanner(System.in);
      int a[]=new int[10];
       System.out.println("Enter values to add");
      for(int i=0;i<a.length;i++) 
         {
           a[i]=vikas.nextInt();
         }
     int sum=0;
         for(int i=0;i<a.length;i++)
           
           {
             sum=sum+a[i];
            
           }
          
          System.out.println("sum is:"+(sum));   
    }     
      
    }
  
  