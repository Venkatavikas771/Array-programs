class Unique
  {
    public static void main(String args[])
    {
      int ar[]={1,1,2,3,3,4,5,6,6,7};
        for(int i=0;i<ar.length;i++)     
          {
            int count=0;
            for(int j=0;j<ar.length;j++)
              {
            
            if(ar[i]==ar[j])
            {
              count++;
            }
                
          }
            if(count==1)
            {
              System.out.println(ar[i]);
            }
          }
    }
  }