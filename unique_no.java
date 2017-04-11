import java.util.*;
class unique_no
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY")
    int n=in.nextInt();
    int[] no=new int[n];
    System.out.println("ENTER THE NUMBERS FOR ARRAY")
    for(int i=0;i<n;i++)
    {
      no[i]=in.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      int flag=0;
      int a=no[j];
          for(int k=0;k<n;k++)
          {
            if(no[j]==no[k])
            {
              flag++;
            }
          }
      if(flag==0)
         System.out.println("THE UNIQUE NUMBER IS"+no[j])
    }
  }
}
    
        
      
