
import java.util.Scanner;

public class hunter44 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			int flag=0;
			String s=String.valueOf(i);
			for(String s1:s.split(""))
			{
				if(s1.equals("3")) 
					{
					flag++;
					}
				if(s1.equals("4"))
				{
					flag++;
					}
			}
			if(flag==s.length())
			{
				System.out.println(i);
			}
		}

	}

}
