package p1;

import java.util.Arrays;
import java.util.Scanner;

public class opsorting {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the inputs");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		int s1=a+b*c;
		int s2= a*b+c;
		int s3=c+a/b;
		int s4=a%b+c;
		int arr[]= {s1,s2,s3,s4};
		
		int length  = arr.length;
		for(int k =0;k<length ;k++) {
			System.out.println(arr[k]);
		}
		//Arrays.sort(arr);
		for(int i =0 ; i<length ;i++)
		{
			for(int j=i+1; j<length ;j++) 
			{
				int temp =0;
				if(arr[i]>arr[j])
				{
                 temp=arr[i] ;
                 arr[i]=arr[j];
                 arr[j]=temp;
                 }
			}
			System.out.print("sorted array is:"+arr[i]+ "\n");
	}

}}
