package p1;

import java.util.Arrays;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int[] arrayrandom=new int[10];
              
              for(int i=0; i<arrayrandom.length; i++)
              {
            	   arrayrandom[i]=((int)(Math.random()*10000000*10)) % 1000; 
              }
              System.out.println(Arrays.toString(arrayrandom));
              int temp;
              for(int i=0; i<arrayrandom.length; i++) {
            	  for(int j=i; j<arrayrandom.length; j++) 
            	  {
            		  if(arrayrandom[i]>arrayrandom[j]) 
            		  {
            		  temp=arrayrandom[i];
            		  arrayrandom[i]=arrayrandom[j];
            		  arrayrandom[j]=temp;
            		  }
            		  if(arrayrandom[i]<arrayrandom[j]) 
            		  {
            		  temp=arrayrandom[i];
            		  arrayrandom[i]=arrayrandom[j];
            		  arrayrandom[j]=temp;
            	  }
              }
              }
              System.out.println("second largest " +arrayrandom[1]);
              System.out.println("second smalest " +arrayrandom[arrayrandom.length-2]);
              
              Arrays.sort(arrayrandom);
              System.out.println(Arrays.toString(arrayrandom));
              System.out.println("second largest " +arrayrandom[1]);
              System.out.println("second smalest " +arrayrandom[arrayrandom.length-2]);
	}
}