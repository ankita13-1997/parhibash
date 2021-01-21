package p1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class primefactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		//int a1[] =new int[10];
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		for(int i=2; i<=n; i++)
		{
			while(n%i==0) 
			{
				//System.out.println(i+ " ");
				l1.add(i);
				n=n/i;
			}
		}
		if(n>2)
		{
			l1.add(n);
		}
		
           System.out.println(l1);
          Integer a1[]=new Integer[l1.size()];
          a1= l1.toArray(a1);
          
          for(int i=0 ; i<=a1.length; i++)
          {
        	  for(int j =i+1 ; j<a1.length;j++) {
        	  
        	  if(a1[i]==a1[j])
        	  {
        		 int q=a1[j];
        		 System.out.println(q);
        	  }
        	  
          }
		
	}

}}
