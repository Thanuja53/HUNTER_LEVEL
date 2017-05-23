
import java.util.*;
class find6
{
  public static void main(String args[])
  {
	  int num;
	  System.out.println("ENTER THE ARRAY SIZE");
	  Scanner in=new Scanner(System.in);
	  num=in.nextInt();
	  int[] n=new int[num];
	  System.out.println("ENTER THE VALUES FOR ARRAY");
	  for(int i=0;i<num;i++)
	  {
		  n[i]=in.nextInt();
	  }
	  for(int j=0;j<num;j++)
	  {
		  int count=0;
		  for(int k=0;k<num;k++)
		  {
			  if(j!=k)
			  {
			  if(n[j]==n[k])
			  {
				 System.out.println("FIRST REPEATING VALUE IS "+n[j]);
				 System.exit(0);
			  }
			  }
		  }
       
	  }
			  
  }
}
