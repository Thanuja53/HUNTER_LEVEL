import java.util.Scanner;

public class hunter43 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s=in.nextLine();
		for(String s1:s.split(""))
		{  
			if(Character.isLetter(s1.charAt(0)))
			{
				System.out.print(s1);
			}
			else
			{
				int n=Integer.valueOf(s1);
				for(int g=0;g<n-1;g++)
				{
					System.out.print(s.charAt(s.indexOf(s1)-1));
				}
	
			}
			
			
		}
		

	}

}
