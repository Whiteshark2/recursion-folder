
public class Quicksort {

	public static void main(String[] args) {
		int arr[] = {1,9,88,2,3,1};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		

	}
	public static void quicksort(int arr[],int si,int ei)
	{
		if(si>=ei)
			return;
		int p = partition(arr,si,ei);
		quicksort(arr,si,p-1);
		quicksort(arr,p+1,ei);
	}
	public static int partition(int arr[],int si ,int ei)
	{
		int pivot = arr[si];
		int c = 0;
		for(int i =si;i<=ei;i++)
		{
			if (arr[i]<pivot)
				c++;
		}
		int temp = arr[si];
		 arr[si] = arr[si+c];
		arr[si+c]= arr[si];
		int pivotIndex = si+c;
		int i = si,j=ei;
		while(i<j)
		{
			if(arr[i]<pivot)
				i++;
			else if(arr[j]>pivot)
				j--;
			else
			{
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return pivotIndex;
	}

}
