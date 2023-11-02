package com.pbsquratraining.Trainingprogram.encapusulation;

public class Bank 
{
	int pin1;

	public int getPin1() {
		return pin1;
	}

	public void setPin1(int pin1) {
		this.pin1 = pin1;
		if(pin1==1212)
		{
			System.out.println("You can login Pin number is "+pin1);
		}
		else if(pin1==1234)
		{
			System.out.println("You can login Pin number is "+pin1);	
		}
		else if(pin1==1200)
		{
		System.out.println("You can login Pin number is "+pin1);
		}
		else
		{
			System.out.println("invalid "+pin1);
		}
	}

	
	

	
	
	

	

	

}
