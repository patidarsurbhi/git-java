
class Test
{
      public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int i=0,min=0;
        for( i=0;i<arr.length;i++)
        {
        	if (arr[i]<min)
        		min=arr[i];
        }
  
         System.out.println(min);
     }
}