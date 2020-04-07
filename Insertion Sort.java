import java.util.*;
import java.io.*;

class Main
{
	void insertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int k = arr[i];
			int j = i-1;

			while(j>=0 && arr[j]>k)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = k;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
	    int[] arr = {13,2,6,22,9,17};
	    Main m = new Main();
	    m.insertionSort(arr);	
    }	
}