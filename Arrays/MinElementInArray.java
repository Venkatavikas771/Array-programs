import java.util.Scanner;
class MinEleInArray
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
       int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
      
    }
       System.out.println("max element is :"+(min));
  }
  }