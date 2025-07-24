import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]={1,3,5,7,9};
		int Sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    Sum+=arr[i];
		}
		double avg=(double)Sum/arr.length;
		System.out.print(avg);
	}
}
