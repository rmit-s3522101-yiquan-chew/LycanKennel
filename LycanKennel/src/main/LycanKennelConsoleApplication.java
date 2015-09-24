package main;

import view.console.TestKennel;

public class LycanKennelConsoleApplication 
{
	public static void main(String[] args)
	{
	/* This line takes the TestDog class we wrote and creates
	* a copy of it in memory */
	TestKennel testKennel = new TestKennel();
	// Once created we can then use the class by calling its methods.
	testKennel.test();
	}

}
