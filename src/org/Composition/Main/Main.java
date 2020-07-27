package org.Composition.Main;

import org.Composition.Laptop.Laptop;

public class Main 
{
	
	public static void main(String[] args)
	{
		Laptop lappy = new Laptop();
		System.out.println(lappy.toString());
		System.out.println(lappy.getGraphicsCard().getBrand());
	}
}
