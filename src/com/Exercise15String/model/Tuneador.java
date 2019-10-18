package com.Exercise15String.model;

public class Tuneador 
{
	public static String[] tunea(String[] cads)
	{
		
		for (int i =0;i<cads.length;i++)
		{
			cads[i] = cads[i].trim();
			cads[i] = cads[i].toLowerCase();
			cads[i] = cads[i].toLowerCase();
			cads[i] = cads[i].replace('a', 'e');
			cads[i] = cads[i].replace('o', 'u');	
		}
		
		return cads;
	}
	
	
	
}
