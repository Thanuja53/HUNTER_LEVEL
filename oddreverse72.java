import java.util.*;
class oddreverse72
{
  public static void main(String args[])
  {
	int a=1;
	Scanner in=new Scanner(System.in);
	System.out.println("ENTER A STRING");
	String s=in.nextLine();
	String[] str=s.split(" ");
    for(String s1:str)
	{
		if(a%2!=0)
		{
	    StringBuffer sb=new StringBuffer(s1);
		System.out.print(sb.reverse()+" ");
		}
		else
		{
		System.out.print(s1+" ");
		}
		a++;
	}
  }
}
