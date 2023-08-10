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















