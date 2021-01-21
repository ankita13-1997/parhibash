package p1;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter the nth term");
		int n =sc.nextInt();
		double sum = 0.0;
		
		for(int i =1; i<=n; i++)
		{
			sum+=1.1/i;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub
	}

}
