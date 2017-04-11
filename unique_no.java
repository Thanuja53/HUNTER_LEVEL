import java.util.*;
class unique_no
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int n=in.nextInt();
    int[] no=new int[n];
    System.out.println("ENTER THE NUMBERS FOR ARRAY");
    for(int i=0;i<n;i++)
    {
      no[i]=in.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      int a=0,b=0;
      int flag=0;
      a=no[j];
          for(int k=0;k<n;k++)
          {
			  b=no[k]; 
            if(a==b)
            {
              flag++;
            }
          }
      if(flag==1)
	  {
         System.out.println("THE UNIQUE NUMBER IS "+a);
		 break;
	  }
    }
  }
}
