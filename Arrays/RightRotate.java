class RightRotate
  {
    public static void main(String args[])
    {
      int a[]={1,2,3,4,5,6};
      System.out.println("Array before shifting ");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
      int temp=a[a.length-1];
      for(int i=a.length-1;i>0;i--)
        {
         a[i]=a[i-1];
        }
      a[0]=temp;
      
      System.out.println("after perfroming right roatation by 1 position ");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]+" ");
        }
    }
  }