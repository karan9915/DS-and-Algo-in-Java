import java.util.*;
import java.io.*;

class Main
{
	void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {9,3,43,16,24,37};
		Main m = new Main();
		m.selectionSort(arr);
    }	
}