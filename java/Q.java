
interface FirstInterface{
	public abstract void methodOne();
}

interface SecondInterface{
	public abstract void methodTwo();
}


class Test implements FirstInterface,SecondInterface{
	public void methodOne()
	{
		System.out.println("method One");
	}

	public void methodTwo()
	{
		System.out.println("method Two");
	}
}

public class Q{
	public static void main(String[] args) {
		
		Test t= new Test();
		t.methodOne();
		t.methodTwo();
	}
}

