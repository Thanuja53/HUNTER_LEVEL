import java.util.Scanner;

public class hunter116 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=in.nextInt();
		int sum=0;
		String s=String.valueOf(n);
		int x=0,y=0;
		for(String s1:s.split(""))
		{
			if(x==0)
				{
				System.out.print(s1+"^"+(x++));
				}
			
			else
			{
			    System.out.print("+"+s1+"^"+(x++));
			}
			sum=(Integer.valueOf(s1)*y++)+sum;
			
		}
		
		System.out.print("=="+sum);
	}

}

