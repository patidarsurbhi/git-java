//array reverse

class Test
{
	public static void main(String[] args) 
	{
		  int arr[]={1,2,3,4,5};
		   int s=0,l=4,c;
		   while(s<l)
		   {
		   	 c=arr[s];
		   	 arr[s]=arr[l];
		   	 arr[l]=c;
		   	 s++;
		   	 l--;
		   }

		   for(int i=0;i<arr.length;i++)

		   System.out.println(arr[i]);
	}
}
