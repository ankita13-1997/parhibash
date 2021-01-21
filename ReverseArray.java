package p1;

import java.util.Scanner;

public class ReverseArray {

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
		System.out.println();
		System.out.println("the reversed array is :");
           for(int i=size-1; i>=0; i--)
           {
        	   System.out.print(arr[i]+ " ");
           }
	}

}
