/**
Author: Tadhg Deeney
Date: 20/03/2018

Description: 
Technical Assessment for Openet

Write a program that calculated the change needed for a transaction using 
a combination of €2 coins, €5 Notes & €10 Notes. 

Output the quantity of coins and notes needed,
output the amount of change given.
*/
import java.util.*;
import java.math.*;

public class Openet{
	public static void main(String[] args){
		//Intro to the Program
		System.out.println("Change Calculator!");
		//Scanner class for input testing purposes
		Scanner sc = new Scanner(System.in);
		
		//Long Values used in the Assessment
		long s = 50L; 
		//Changes the s value to perform other tests
		while (s != 0L)
		{
			//Tells the User when to input a long value
			System.out.println("Enter Change Value(l):");
			//Replaces the current value of s with the input value
			s=sc.nextLong();
			//Runs the Method Solution.optimalChange
			Change m = Solution.optimalChange(s);

			System.out.println("Coin(s)  2E: " + m.coin2);
			System.out.println("Bill(s)  5E: " + m.bill5);
			System.out.println("Bill(s) 10E: " + m.bill10);

			long result = m.coin2 * 2 + m.bill5 * 5 + m.bill10 * 10;
			System.out.println("\nChange given = " + result);
		}
		System.out.println("Goodbye!");
	}
}


//Change Class with properties of Change Value
class Change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}

//Solution Class with method optimalChange()
class Solution {
    
    // Do not modify this method signature
    static Change optimalChange(long s) {
        Change result = new Change();
        result.bill10 = 0;
        result.bill5 = 0;
        result.coin2 = 0;
        
        if(s >= 10)
        {
            result.bill10 = s/10;
            if(s%10 != 0)
            {
                result.bill5 = (s%10)/5;
                if(s%5 != 0)
                {
                    result.coin2 = ((s%10)%5)/2;
                }
            }
            return result;
        }
        if(s <= 9 && s != 6)
        {
            result.bill5 = s/5;
            if(s/5 != 0)
            {
                result.coin2 = (s%5)/2;
				
            }
			return result;
        }
        if(s <= 4 || s == 6)
        {
            result.coin2 = s/2;
        }
        return result;
    }
}