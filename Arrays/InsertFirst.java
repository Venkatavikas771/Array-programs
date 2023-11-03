import java.util.Scanner;
class InsertFirst
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
     
      int a[]={1,2,3,4,5,6,7};
      int b[]=new int[a.length+1];
       System.out.println("Enter the value to insert");
      int in=vikas.nextInt();
  

      for(int i=0;i<b.length;i++)
        {
          if(i==0)
          {
            b[i]=in;
          }
         if (i>0)
          {
           b[i] =a[i-1];
          }
         
        }
       System.out.println("The array elements after insertion");
      for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
      
      
    }
  }