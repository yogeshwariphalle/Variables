package com.variables;

public class StaticandNonstaticVariables {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) 
	{
		StaticandNonstaticVariables obj = new StaticandNonstaticVariables();
        System.out.println(obj.a);
		System.out.println(obj.b);

		obj.a=50;
		obj.b=45;
		System.out.println(obj.a);
		System.out.println(obj.b);

		StaticandNonstaticVariables obj1 = new StaticandNonstaticVariables();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}

}
