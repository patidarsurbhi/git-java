class underAgeException extends Exception
{
	underAgeException(String msg)
	{
		super(msg);
	}
}

class costomexception
{
	public static void validateAge(int age)
	{
		if (age<18) {
			throw new underAgeException("now time to enjoy");
			
		}
	}

	public static void main(String[] args)
	{
		int age=10;
		try
		{
			validdateAge(age);
		}
		 catch(underAgeException e)
		 {
		 	e.printStackTrace();
		 }
	}
}