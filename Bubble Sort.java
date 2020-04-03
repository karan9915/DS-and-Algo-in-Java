import java.util.*;
import java.io.*;

class Main
{
	void bubbleSort(int arr[])
	{
		int size = arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
				    arr[j] = arr[j+1];
				    arr[j+1] = temp;
				}
			}
		}

		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {9,4,6,1,3,7,5};
		Main m = new Main();
		m.bubbleSort(arr);
       }	
}