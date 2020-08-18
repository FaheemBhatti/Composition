package org.Composition.Main;

import org.Composition.Components.Graphicscard;
import org.Composition.Components.Processor;
import org.Composition.Laptop.Laptop;

public class Main 
{
	public static void main(String[] args)
	{
		Processor processor = new Processor("Intel", "i5 72000u", "7th", 4, 8, 16, 3.1f);
		Graphicscard graphicsCard = new Graphicscard("Nvidia", "GTX", "16GB");
		
		Laptop laptop = new Laptop(15.7f, "32GB" , 10000, "Backled" , new Processor() , new Graphicscard());
		System.out.println(laptop);
		
		Laptop gammingLaptop = new Laptop(17.6f, "32GB", 2, "backlit", new Processor(), new Graphicscard());
		System.out.println(gammingLaptop.toString());		
	}
}