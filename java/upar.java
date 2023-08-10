class Test
{
	 public static void main(String [] args)
	 {
	    char str[]="hello";
        int i;
        for(i=0;i<strlen(str);i++)
        {
        	if(str[i]>=65&&str[i]<=90)
        str[i]= str[i]+32;
        }
	   System.out.println(str[i]);
	  }
}