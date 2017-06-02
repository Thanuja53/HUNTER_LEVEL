import java.util.Scanner;

public class hunter48 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING 1");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println("ENTER THE STRING 2");
		String s1=in.nextLine();
		if(s.indexOf(s1)>=0)
		{
			System.out.print(s.indexOf(s1));
		}
		else
		{
			System.out.print("1");
		}
	}
}

