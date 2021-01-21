package p1;

import java.util.Scanner;

public class magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
			 System.out.println("plz think anumber in your mind starting from 1 tp 100  and lock it");
             int number=sc.nextInt();
             int start=1;
             int end=10;
             int i=end;
			 while(i!=0) {
               int mid= (start + end)/2;
               int end1=mid;
               if(mid==number)
               {
            	   System.out.println("yaah !! guessed the right number");
               }
                if(number >=mid)
                {
                	int mid1=(mid +end)/2;
                	if(mid1==number)
                	 {
                  	   System.out.println("yaah !! guessed the right number");
                     }
                	
                	else if(number<=mid) {
                		int mid2=(start + mid)/2;
                		if(mid2==number)
                   	   {
                     	   System.out.println("yaah !! guessed the right number");
                        }
                		
                	}
                	else
                		System.out.println("number is out of bound");
                	
                }
                i--;
             }	
             
	}

}
