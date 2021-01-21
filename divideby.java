package p1;

import java.util.Arrays;

public class divideby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		
		for(int i=0; i<100; i++)
		{
			a[i]=i;
		}
		
       System.out.println(Arrays.toString(a));
       
       for(int i=0; i<a.length; i++)
       {
    	   if(a[i]%11==0)
    	   {
    		   System.out.println(a[i]);
    	   }
       }
	}

}
