//array average

class Test
{
      public static void main(String[] args)
    {
        int arr[]={4,4,4,4,4};
          int i,sum=0;
       {
         for(i=2;i<arr.length;i++)
          //System.out.println(arr[i]);
         	sum=arr[i]+sum/arr.length;
       }
         System.out.println(sum);
     }
}