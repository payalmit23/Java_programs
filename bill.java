input  : no of days 
output : if days are greater than or equal 3 months, 20 % discount
      >1 month and < 3months , 10% discount , <1 month No discount

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double disAmt,payAmt;
        double amt=10.0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Days");
		int noDays = sc.nextInt();
		System.out.println("Enter amount of one day");
	    amt = sc1.nextDouble();
		double totAmt = noDays * amt;
		if (noDays > 90){
			System.out.println("Congo you got Discount of 20%");
			disAmt = totAmt * 0.2;
		    payAmt = totAmt - disAmt;
			System.out.println("Final Bill : "+payAmt);
		}
	    else if (noDays > 60 && noDays < 90 ){
			System.out.println("Congo you got Discount of 10%");
			disAmt = totAmt * 0.1;
			payAmt = totAmt - disAmt;
			System.out.println("Final Bill : "+payAmt);
		}
		else 
		System.out.println("Sorry no discount");
	}
}