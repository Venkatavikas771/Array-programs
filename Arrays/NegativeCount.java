import java.util.Scanner;
class NegCount
  {
    public static void main(String args[])
    {
      Scanner cou=new Scanner(System.in);
      System.out.println("Enter the negative values");
      int a[]=new int[10];
      for(int i=0;i<a.length;i++)
        {
          a[i]=cou.nextInt();
        }
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            count++;
             
          }
        }
      System.out.println("The total negative elements are:"+(count));
    }
  }