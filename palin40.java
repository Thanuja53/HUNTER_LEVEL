import java.util.Scanner;

public class palin40{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE NUMBER");
   		String s=in.nextLine();
   		int sum=0;
   		for(String s1:s.split(""))
   		{
   			sum=sum+Integer.valueOf(s1);
   		}
   		StringBuffer sb=new StringBuffer(String.valueOf(sum));
   		String str=new String(sb.reverse());
   		if((String.valueOf(sum)).equals(str))
   		{
   			System.out.print("PALINDROME");
   		}
   		else
   		{
   			System.out.print("NOT A PALINDROME");
   		}
   		

	}

}

