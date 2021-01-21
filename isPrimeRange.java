package p1;

import java.util.Scanner;

public class isPrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        System.out.println("enter the number you like");
        int n1=sc.nextInt();
        System.out.println("enter the second number you like");
        int n2=sc.nextInt();
        System.out.println("so ur range starts from "+n1+" to "+n2);
        String primenumbers= "";
       
        
       
                       for(int i=n1;i<=n2;i++)
                          {
                    	   int flag=0;
                          for(int j =i; j>=1; j--)
                          {
 	                             if(i%j==0)
 	                             {
 	                            	
 	                            	flag=flag+1;
 	                            	
 	                             }
 	                             
                            }
                                   if(flag==2)
                               {
                    	           primenumbers=primenumbers + i + " ";
                               }
                       }
              System.out.println("range of prime numbers from "+n1+ " to " +n2+ "are");
              System.out.println(primenumbers);
	}

}
