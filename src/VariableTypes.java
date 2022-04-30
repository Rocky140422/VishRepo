
public class VariableTypes {
	int	sum=100; //Instnace	variable
	static	int	num3=10; //Static	Variable
	public static	void 	add(int	num1)
	{
//		int sum = 100;
	int	num2=20; //local	variable

	System.out.println("Addition = " + (num1+num2+num3));
//	System.out.println("Sum	= " + sum);
	int num3=200;
	}
	public	static	void	main(String[]	args)	{
	add(30);
	VariableTypes	a=	new	VariableTypes();
	
	System.out.println("Sum	= " + a.sum);
	System.out.println("Static variable = "	+ num3);
	}

}
