package Numbers;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("given Integer is even");
		}
		else 
		{
			System.out.println("given Integer is odd");
		}

	}

}
