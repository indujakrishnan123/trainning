package oopsconcept;

public class Agrregation
	{
	 double area( int a)
	{
		return square(a)*3.14;
	}
public static void main(String[]args)
{ 
	Agrregation ag = new Agrregation();
	Square sq =new Square();
	System.out.println(ag.area(5));
	 
}}

