//array sum
/*class Test
{
      public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
          int i,sum=0;
       {
         for(i=0;i<5;i++)
          sum=sum+arr[i];
       }
         System.out.println(sum);
     }
}*/
/*array reverse

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
}*/


//array average

/*class Test
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
}*/


//ray max
/*ass Test
{
      public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int i=0,max=0;
        for( i=0;i<arr.length;i++)
        {
        	if(arr[i]>max)
        		max=arr[i];
        }
      

         System.out.println(max);
     }
}*/

/*ass Test
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
}*/

//ArrayList Index

/*mpor java.util.*;
class Test
{
	public static void main(String[] args)
	 {
          ArrayList al=new ArrayList();
          al.add(10);
          al.add(20);
          al.add(30);
          System.out.println(al.indexOf(10));
          System.out.println(al.indexOf(20));

		
	}
}*/
  //insert element
/*import java.util.*;
  class Test
  {
  	public static void main(String[] args)
  	 {
  	 	ArrayList al=new ArrayList();
  	 	al.add(10);
  	 	al.add(20);
  	 	al.add(40);
  	 	//t a=al.add(0,30);
  	 	System.out.println(al);
  	 	al.add(1,3);
  	 	  	 	System.out.println(al);
  		
  	}
  }*/



  //contain array
  /*import java.util.*;
  class Test
  {
  	public static void main(String[] args) 
  	{
  		ArrayList al=new ArrayList();
  	    al.add(10);
  	    al.add(20);
  	    al.add(30);
  	    al.add(40);
  	    System.out.println(al);
  	    boolean B=al.contains(10);
  	    System.out.println(B);
  	}
  
  }*/

 //rray even  odd program
 /* class Test
  {
  	public static void main(String[] args)
  	 {
  	 	int arr[]={2,3,4,5,6,7};
  	 	for(int i=0;i<arr.length;i++)
  	 	   if(arr[i]%2==0)
  	 	   {
  	 	   	System.out.println(arr[i]);
  	 	   }
  		
  	}
  }*/
/*import java.util.*;
 class Test
 {
 	public static void main(String[] args) 
 	{
 	//aaray convert to arrayList

 		int arr[]={2,3,4,5,4};
 		ArrayList al=new ArrayList();
 		for(int i=0;i<arr.length;i++)
 		{
           al.add(arr[i]);
 		
 		}
 		  System.out.println(al);
 	}
 }*/



 class Test
 {
 	public static void main(String[] args)
 	{
 	    int a[]={1,2,3,4,5};
 	    int i,min,smin;
 	    if(a[0]<a[1])
 	    {
 	    	smin=a[0];
 	    	min=a[1];
 	    }

 	       else
 	       {
 	       	 smin=a[1];
 	       	 min=a[0];
 	       }

 	       for(i=2;i<a.length-1;i++)
 	       {
 	       	    if(a[i]>min)
 	          	{
 	       		    smin=min;
 	       		    min=a[i];
 	         	}
 	         	else if(a[i]<min&&a[i]>smin)
 	       	    {
 	       		    smin = a[i];
 	         	}
 	       }
 	       System.out.println(smin);
 	}
}

 //smin
/* class Test
 {
 	public static void main(String[] args)
 	{
 	    int a[]={1,2,3,4,5};
 	    int i,min,smin;
 	    if(a[0]>a[1])
 	    {
 	    	smin=a[0];
 	    	min=a[1];
 	    }

 	       else
 	       {
 	       	 smin=a[1];
 	       	 min=a[0];
 	       }

 	       for(i=2;i<a.length-1;i++)
 	       {
 	       	    if(a[i]<min)
 	          	{
 	       		    smin=min;
 	       		    min=a[i];
 	         	}
 	         	else if(a[i]>min&&a[i]<smin)
 	       	    {
 	       		    smin = a[i];
 	         	}
 	       }
 	       System.out.println(smin);
 	}
}*/















