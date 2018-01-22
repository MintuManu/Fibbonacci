package fibbonacci;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args){
		System.out.print("enter n");
		int a=0;
		int b=1;
		int s=0;
		Scanner in =new Scanner(System.in);
		 int n =in.nextInt();
		System.out.print(a+","+b);
		for(int i=1;i<n;i++)
		{
			s=a+b;
			System.out.print(","+s);
			a=b;
			b=s;
		}
		}
}
