package org.Composition.Components;

public class Processor 
{
	private String brand;
	private String series;
	private String generation;
	private int noOfCores;
	private int noOfThreads;
	private int cacheMemory;
	private float frequency;
	
	public Processor() 
	{
		this.brand = "intel";
		this.series = "i5 7200u";
		this.generation = "7th";
		this.noOfCores  = 2;
		this.noOfThreads = 4;
		this.cacheMemory = 256;
		this.frequency = 3.1f;
	}

	public Processor(String brand, String series, String generation, int noOfCores, int noOfThreads, int cacheMemory,
			float frequency) 
	{
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.noOfCores = noOfCores;
		this.noOfThreads = noOfThreads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
	}

	@Override
	public String toString() 
	{
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", noOfCores="
				+ noOfCores + ", noOfThreads=" + noOfThreads + ", cacheMemory=" + cacheMemory + ", frequency="
				+ frequency + "]";
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

	public String getGeneration() 
	{
		return generation;
	}

	public void setGeneration(String generation) 
	{
		this.generation = generation;
	}

	public int getNoOfCores() 
	{
		return noOfCores;
	}

	public void setNoOfCores(int noOfCores)
	{
		this.noOfCores = noOfCores;
	}

	public int getNoOfThreads() 
	{
		return noOfThreads;
	}

	public void setNoOfThreads(int noOfThreads) 
	{
		this.noOfThreads = noOfThreads;
	}

	public int getCacheMemory() 
	{
		return cacheMemory;
	}

	public void setCacheMemory(int cacheMemory) 
	{
		this.cacheMemory = cacheMemory;
	}

	public float getFrequency() 
	{
		return frequency;
	}

	public void setFrequency(float frequency) 
	{
		this.frequency = frequency;
	}	
}