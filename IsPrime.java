package p1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number you like");
            int n=sc.nextInt();
            System.out.println("your number is " +n);
            int m =n/2;
            int flag=0;
            
            if(n==0 || n==1)
               {
            	System.out.println("the number is not prime");
               }
            else {
                           for(int i=2;i<=m;i++)
	                          {
	 	                             if(n%i==0)
	 	                             {
	 	                            	System.out.println(n+ " number is not a prime number");
	 	                            	flag=1;
	 	                            	break;
	 	                             }
	                            }
                           if(flag==0)
                           {
                        	   System.out.println(n+ " the number is prime number");
                           }
                  }
}}
