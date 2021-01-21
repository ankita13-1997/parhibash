package p1;

import java.util.Scanner;

public class factorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int fact=n;
		for(int i =n-1; i>=1;i--)
		{
			fact=fact*i;
			System.out.println(fact);
		}
         System.out.println("the factorial of the number is "+fact);
	}

}
