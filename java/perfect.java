class perfect
{
    public static void main(String[] args)
    {
    int n=2,i=1,s=0;
         while(i<=n/2)
         {
           if(n%i==0)
           s=s+i;
           i++;
          }
              if(n==s)
            System.out.println("is perfect");
            else
            System.out.println("is not perfect");
        }
   }
       