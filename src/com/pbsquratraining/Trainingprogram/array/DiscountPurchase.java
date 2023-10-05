package com.pbsquratraining.Trainingprogram.array;
import java.util.Scanner;
public class DiscountPurchase
{
	public int totalAmount(int a, int b)
	{
		int total= a+b;
		return total;
	}
	public void netAmount(int value)
	{
		if(value>5000)
		{
			int netamt= value-(value*20/100);
			System.out.println("You are Eligible for discount");
			System.out.println("Your Net amount is"+netamt);
		}
		else
		{
			System.out.println( "You are not eligible for discount");
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first item price");
		int a=sc.nextInt();
		System.out.println("enter second item price");
		int b=sc.nextInt();
		DiscountPurchase dp= new DiscountPurchase();
		int value=dp.totalAmount(a,b);
		System.out.println("Total Amount is "+value);
		dp.netAmount(value);
			
	}

}
