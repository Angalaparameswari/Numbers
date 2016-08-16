import java.util.Scanner;


public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		long n=sc.nextInt();
		long s=0,x=0;
		while(n!=0)
		{
			x=n%10;
			s=(s*10)+x;
			n=n/10;
		}
		System.out.println(s);

	}

}
