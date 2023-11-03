import java.util.Scanner;
class CountEleInArray
  {
    public static void main(String args[])
    {
     Scanner vikas=new Scanner(System.in);
      int a[]=new int[10];
       System.out.println("Enter values");
      for(int i=0;i<a.length;i++) 
         {
           a[i]=vikas.nextInt();
         }
     int count=0;
         for(int i=0;i<a.length;i++)
           
           {
             count++;
            
           }
          
             System.out.println("number of elements :"+(count));
    }     
      
    }
  
  