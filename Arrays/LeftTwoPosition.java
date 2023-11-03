import java.util.Scanner;
class LeftTwoPos
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      int a[]={1,2,3,4,5,6};
      System.out.println("Array before shifting ");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Enter the number of shifting you want to shift");
      int number=vikas.nextInt();
          for(int i=0;i<number;i++)
            {
            int temp=a[0];
        
          for(int j=0;j<a.length-1;j++)
            
        {
          a[j]=a[j+1];
        }
          a[a.length-1]=temp;
        } 
        
        
      System.out.println("after perfroming left roatation by" +number+"positions ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }
