package interfacesample;
import java.util.Scanner;
public class Bank { 
	Scanner sc=new Scanner(System.in);
	private int pin;
	static   int totbalance=15000;
	  public int setpin() {
		  this.pin=pin; 
		 this.totbalance= totbalance;
		  System.out.print("enter the pin");
	       pin =sc.nextInt();
		 return pin;
	 }
}
