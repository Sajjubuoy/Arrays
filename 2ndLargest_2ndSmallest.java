import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]={1,3,5,7,9};
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]<smallest)
		    {
		        smallest=arr[i];
		    }
		    if(arr[i]>largest)
		    {
		        largest=arr[i];
		    }
		}
		int second_smallest=Integer.MAX_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		 if(arr[i]<second_smallest && arr[i]!= smallest)
		 {
		     second_smallest=arr[i];
		     //System.out.print("Second Smallest: "+ second_smallest);
		 }
		 if (arr[i]>second_largest && arr[i]!= largest)
		 {
		     second_largest=arr[i];
		     //System.out.println("Second Largest: "+ second_largest);
		 }
		}
		System.out.println("Second Smallest: "+ second_smallest);
		System.out.println("Second Largest: "+ second_largest);
		//System.out.println();
	}
}
