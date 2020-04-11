import java.util.*;
import java.io.*;

class Main
{
	void sort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;

			sort(arr,l,mid);
			sort(arr,mid+1,r);

			merge(arr,l,mid,r);
		}
	}

	void merge(int arr[], int l, int mid, int r)
	{
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for(int i=0;i<n1;i++)
		{
			left[i] = arr[l + i];
		}
		for(int j=0;j<n2;j++)
		{
			right[j] = arr[mid + 1 + j];
		}

		int i=0, j=0, k=l;

		while(i<n1 && j<n2)
		{
			if(left[i]<right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while(i<n1)
		{
			arr[k] = left[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {12,11,13,5,6,7};
		Main m = new Main();
		m.sort(arr,0,arr.length-1);
		m.printArray(arr);
    }
}