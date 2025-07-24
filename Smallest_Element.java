import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]={1,3,5,7,9};
		int small=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>small)
		    {
		        small=arr[i];
		    }
		}
		System.out.print(small);
	}
}
