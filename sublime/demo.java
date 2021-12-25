class Demo
{
	public static void heapify(int[] arr,int n,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n&&arr[l]>arr[largest])
			largest=l;
		if(r<n&&arr[r]>arr[largest])
			largest=r;
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;

			heapify(arr,n,largest);
		}
	}

	public static void buildHeap(int[] arr,int n)
	{
		int start=n/2-1;
		for(int i=start;i>=0;i--)
		{
			System.out.println("index "+i);
			heapify(arr,n,i);
		}
	}

	public static void printHeap(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {1, 3, 5, 4, 6, 13, 10,
                      9, 8, 15, 17 };
		int n=arr.length;
		buildHeap(arr,n);
		printHeap(arr,n);
	}
}