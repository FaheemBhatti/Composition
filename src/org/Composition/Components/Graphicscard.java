package org.Composition.Components;

public class Graphicscard 
{
	private String brand;
	private String series;
	private String memory;
	
	public Graphicscard() 
	{
		this.brand = "Nvidia";
		this.memory = "2GB";
		this.series = "GTX";
	}

	public Graphicscard(String brand, String series, String memory)
	{
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() 
	{
		return "Graphicscard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public String getSeries() 
	{
		return series;
	}

	public void setSeries(String series) 
	{
		this.series = series;
	}

	public String getMemory() 
	{
		return memory;
	}

	public void setMemory(String memory) 
	{
		this.memory = memory;
	}
}