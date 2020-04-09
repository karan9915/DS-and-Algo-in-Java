import java.util.*;
import java.io.*;

class Main
{
	int partition(int arr[], int low, int high)
	{
		int pi = arr[high];
		int i = low - 1;
		for(int j=low;j<=high;j++)
		{
			if(arr[j]<pi)
			{
				i++;

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		    }  
		}

		int curr = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = curr;

		return i+1;
	}

	void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int pi = partition(arr,low,high);

			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {10,80,30,90,40,50,70};
		Main m = new Main();
		int size = arr.length;
		m.quickSort(arr,0,size-1);
		m.print(arr);
    }	
}