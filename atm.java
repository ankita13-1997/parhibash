package p1;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your amount");
     int amount = sc.nextInt();
     int note1=amount/1000;
     System.out.println("amount of 1000 note is-"+note1);
     int b=amount%1000;
    		 if(b!=0)
    		 {
    			 int b1=b/500;
    			 System.out.println("amount of 500 note is-" +b1);
    			 int b2=b%500;
    			 if(b2!=0)
    			 {
    				int b3=b2/100;
    				System.out.println("amount of 100 note is -"+b3);
    				int b4=b2%100;
    				if(b4!=0) {
    					int b5=b4/10;
    					System.out.println("amount of 10 rs is -"+b5);
    				}
    				 }
    			 
    			 
    		 }
	}

}
