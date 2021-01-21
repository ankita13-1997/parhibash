package p1;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the original array is :");
		for(int i=0; i<size; i++) {
			
			System.out.print(arr[i]+ " ");
		}
		//Arrays.sort(arr);
		System.out.println();
		System.out.println("the sorted array is asending ");
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				
			int temp=0;
			if(arr[i]>arr[j])
					{
				      temp=arr[i];
				      arr[i]=arr[j];
				      arr[j]=temp;
					}
		}
		
          System.out.print(arr[i]+ " ");
	}
		System.out.println();
		System.out.println("the sorted array is descending ");
	
		for(int i=0; i<size; i++)
		{
			int temp =0;
			for(int j=i+1; j<size; j++ ) 
			{
				if(arr[i]<arr[j])
				{
					 temp=arr[i];
				      arr[i]=arr[j];
				      arr[j]=temp;
				}
			}
			
			 System.out.print(arr[i]+ " ");
		}

}
}
