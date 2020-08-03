package org.Composition.Main;

import org.Composition.Conponents.Graphicscard;
import org.Composition.Conponents.Processor;
import org.Composition.Laptop.Laptop;

public class Main 
{
	
	public static void main(String[] args)
	{
		Processor processor = new Processor("Intel", "i5 72000u", "7th", 4, 8, 16, 3.1f);
		Graphicscard graphicsCard = new Graphicscard("Nvidia", "GTX", "16GB");
		
		Laptop gammingLaptop = new Laptop(17.6f, "32GB", 2, "backlit", processor, graphicsCard);
		System.out.println(gammingLaptop.toString());
		
	}
}
