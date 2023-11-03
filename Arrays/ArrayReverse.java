import java.util.Scanner;
class PrintArraRev
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the size");
       int size= vikas.nextInt();
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=vikas.nextInt();
        }
      for(int i=a.length-1;i>=0;i--)
        {
         System.out.println( "Reverse is :"+(a[i]));
        }
    }
  }