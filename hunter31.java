import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hunter31 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE ARRAY LENGTH");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ARRAY VALUES");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i1=0;i1<n;i1++)
		{   
			int sum=1; 
			for(int j=i1;j<n;j++)
			{
				sum=sum*a[j];
			}
			al.add(sum);
		}
		Collections.sort(al);
		System.out.print(al.get(al.size()-1));
		

	}

}
