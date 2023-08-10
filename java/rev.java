class rev
{
public static void main(String[] args)
{
	int n=234,reverse=0;
	System.out.println("original number"+n);
	while(n!=0){
	int digit=n%10;
	reverse=reverse*10+digit;
	n=n/10;
}
System.out.println(reverse);
}
}