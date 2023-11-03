import java.util.Scanner;
class Sortingasc
  {
    public static void sortingArray(int a[],int size)
    {
      int temp;
      
    for(int i=0;i<a.length;i++)
  {
    for(int j=i+1;j<a.length;j++)
      {
        if(a[j]<a[i])
        {
          temp=a[j];
          a[j]=a[i];
          a[i]=temp;
        }
      }
    
  }
      
      System.out.println("Elements after sorting:");
        for(int i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }
      
  }
  
  
      public static void main(String args[]) 
        {
        Scanner vikas=new Scanner(System.in);
        System.out.println("Enter the string size");
        int size=vikas.nextInt();
        System.out.println("Enter the array elements");
          int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
          a[i]=vikas.nextInt();
        }
          sortingArray(a,size);
            
          
        }
  }
