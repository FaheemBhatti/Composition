package org.Composition.Laptop;

import org.Composition.Conponents.Graphicscard;
import org.Composition.Conponents.Processor;

public class Laptop 
{
	private float screen;
	private String ram;
	private int hardDrive;
	private String keyboard;
	private Processor processor;
	private Graphicscard graphicsCard;
	
	public Laptop() 
	{
		this.screen = 15.6f;
		this.ram = "16GB";
		this.hardDrive = 10000;
		this.keyboard = "backlit";
		this.processor = new Processor();
		this.graphicsCard = new Graphicscard();
	}

	public Laptop(float screen, String ram, int hardDrive, String keyboard, Processor processor,
			Graphicscard graphicsCard) 
	{
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.keyboard = keyboard;
		this.processor = processor;
		this.graphicsCard = graphicsCard;
	}
	
	@Override
	public String toString() 
	{
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", keyboard=" + keyboard
				+ ", processor=" + processor + ", graphicsCard=" + graphicsCard + "]";
	}

	public float getScreen() 
	{
		return screen;
	}

	public void setScreen(float screen) 
	{
		this.screen = screen;
	}

	public String getRam() 
	{
		return ram;
	}

	public void setRam(String ram) 
	{
		this.ram = ram;
	}

	public int getHardDrive() 
	{
		return hardDrive;
	}

	public void setHardDrive(int hardDrive) 
	{
		this.hardDrive = hardDrive;
	}

	public String getKeyboard()
	{
		return keyboard;
	}

	public void setKeyboard(String keyboard) 
	{
		this.keyboard = keyboard;
	}

	public Processor getProcessor() 
	{
		return processor;
	}

	public void setProcessor(Processor processor) 
	{
		this.processor = processor;
	}

	public Graphicscard getGraphicsCard() 
	{
		return graphicsCard;
	}

	public void setGraphicsCard(Graphicscard graphicsCard) 
	{
		this.graphicsCard = graphicsCard;
	}
}
