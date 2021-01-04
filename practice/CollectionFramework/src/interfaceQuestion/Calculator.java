package interfaceQuestion;

public interface Calculator {
	
	default int add(int a,int b)
	{
		return a+b;
	}

}
