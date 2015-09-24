package pets;
/*
* Dog
* version 1.0
* 13/06/2015
* © Rodney Cocker
*/
public class Dog
{
	// An attribute of a class, this one gives the dog a name.
	public String name = "Fido";
	public int age = 10;
	public String breed = "Laborator";
	public String colour = "Black and white";
	public int daysOfBoarding = 10;
	// Gives the animal the ability to talk and introduce him/herself.
public String talk()
{
//	// Standard Java command for printing to the console.
//	System.out.println("Woof Woof Woof!!!");
//	System.out.println("I am " + age * 7 + " years old.");
	
	//Change to return type 24/9/15
	return "Woof Woof Woof!!! \n I am " + age * 7 + "years old " + colour + " " + breed + "\n I will be staying here for " + daysOfBoarding + " day(s)";

}
}