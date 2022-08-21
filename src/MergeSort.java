
public class MergeSort {

	public static void main(String[] args) {
		int a[]= {2,5,22,1,0,};
		int size=a.length;
		mergesort(a,0,size-1);
		for(int i =0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static void mergesort(int a[],int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int mid=(low+high)/2;
		mergesort(a,low,mid);
		mergesort(a,mid+1,high);
		Merge(a,low,high);
	}
	public static void Merge(int a[],int low,int high)
	{
		int size =high-low+1;
		int mid =(low+high)/2;
		int t[]=new int[size];
		int i=low;
		int j= mid+1;
		int k=0;
		while(i<=mid && j<=high)
		{ 
			if(a[i]<a[j])
			{
			t[k]=a[i];
			i++;
			k++;
			}
			else
			{
				t[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			t[k]=a[i];
			k++;
			i++;
		}
		while(j<=high)
		{
			t[k]=a[j];
			k++;
			j++;
		}
		int m=0;
		for(i=low;i<=high;i++)
		{
			a[i]=t[m];
			m++;
		}
	}
}