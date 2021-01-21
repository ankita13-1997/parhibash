package p1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc=new Scanner(System.in);
               System.out.println("enter the value of n as power");
               int n = sc.nextInt();
               
               int base=2;
               int result=1;
               
               int i=n;
                   while(i!=0)
                   {
                	   result*=base;
                	   --i;
                   }
               
                   System.out.println(result);
                   
                   if(result==256)
                   {
                	   System.out.println("best result for input "  +n+ "and the result is " +result);
                   }
                   else {
                	   System.out.println("try to put value of n another time");
                   }
	}

}
