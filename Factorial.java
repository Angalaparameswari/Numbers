import java.io.*;
import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		long n=sc.nextLong();
		long fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
