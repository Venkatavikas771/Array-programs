import java.util.Scanner;
class OddCount
  {
    public static void  countAndPrintOdd(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
          System.out.println("Odd numbers are ;"+(a[i]));
            count++;
          }
        }
      System.out.println("The total odd numbers are :"+(count));
    }

      public static void main(String args[])
        {
        Scanner cou=new Scanner(System.in);
           System.out.println("Enter the values");
        int a[]=new int[10];
         for(int i=0;i<a.length;i++)
           {
             a[i]=cou.nextInt();
             
           }
        countAndPrintOdd(a);
    }
  }