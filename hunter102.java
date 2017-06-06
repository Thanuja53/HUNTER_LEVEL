
import java.util.Scanner;

public class hunter102 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0,sum1=0;
		String s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);
        String s1=new String(sb);
        int n=Integer.valueOf(s1);
        while(n!=0)
        {
        	sum1=sum1+sum;
        	int c=n%10;
        	sum=sum+c;
        	n=n/10;
        	
        }
        System.out.print(sum1);

	}

}
