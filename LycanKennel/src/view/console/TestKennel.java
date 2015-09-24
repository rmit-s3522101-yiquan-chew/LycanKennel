package view.console;
import java.util.Scanner;
import pets.*;
/*
* TestDog
* version 1.0
* 13/06/2015
* © 2015 Rodney Cocker
*/
public class TestKennel
{
	/*
	* Tests the creation of a dog and allowing a user to modify
	* its attributes.
	*/
	public void test()
	{	
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("Hello " + dog.name + ", who's a good dog?");
	
		dog.talk();
		
		System.out.println("Hi " + cat.name + ", ");
	
		Scanner console = new Scanner(System.in);
	
		System.out.println("Please enter a new name for the dog");
		dog.name = console.next();
	
		System.out.println("Hello " + dog.name + ", who's a good dog?");
		console.close();
	}
}