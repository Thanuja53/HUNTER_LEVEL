import java.util.Scanner;

public class day130 {

	public static void main(String[] args) {
		String[] s={"sun","mon","tue","thu","fri","sat"};
		Scanner in=new Scanner(System.in);
		System.out.println("enter the day");
		String s1=in.nextLine();
			if(s[0].toUpperCase().equals(s1.toUpperCase()))
			{
				System.out.println(s1+"=FALSE");
			}
			else
		{
			System.out.println(s1+"=TRUE");
		}

	}

}

