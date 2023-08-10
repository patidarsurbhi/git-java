//20.
class Test
{
	public static void main(String[] args) 
	{
		int arr[]={1,3,4,6,7};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		  {
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;

			     }
			}
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+" ");
      
    }
	
}