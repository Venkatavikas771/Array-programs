import java.util.Scanner;
class DeletionUsingTwoArray
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
     
      int a[]={1,2,3,4,5,6,7};
      int b[]=new int[a.length-1];
       System.out.println("Enter the position to delete");
      int pos=vikas.nextInt();

      for(int i=0;i<a.length;i++)
        {
          if(i==pos)
          {
            b[i]=a[i+1];
          }
        
            else if(i>pos)
            {
              b[i]=a[i+1];
            }
        
         
          else 
         {
           b[i]=a[i];
         }
          
         
        }
       System.out.println("The array elements after deletion");
      for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
      
      
    }
  }