package com.Exercise15String.app;

import com.Exercise15String.model.Tuneador;

public class StringsApp {

	public static void main(String[] args) {
		String cad1="Como un esfuerzo del Vaticano, para que la fe y la religión lleguen a las"
				+ " nuevas generaciones, lanzaron el rosario electrónico eRosary, que es un "
				+ " dispositivo electrónico con forma de pulsera que se conecta a una aplicación gratuita de tu teléfono móvil que se"
				+ " puede descargar para Android e iOS, y que se activa al hacer la señal de la cruz" ;
		String cad2="Como un esfuerzo del Vaticano, para que la fe y la religión lleguen a las" 
				+ " nuevas generaciones, lanzaron el rosario electrónico eRosary, que es un " 
				+ " dispositivo electrónico con forma de pulsera que se conecta a una aplicación gratuita de tu teléfono móvil que se"  
				+ " puede descargar para Android e iOS, y que se activa al hacer la señal de la cruz";
			
		
		System.out.println(cad1.charAt(2));
		System.out.println(cad1.codePointAt(2));
		System.out.println(cad1.codePointBefore(2));
		System.out.println(cad1.codePointCount(2,3));
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("Android"));
		//System.out.println(cad1.valueOf(45.8));
		System.out.println(cad1.endsWith("cruz"));
		System.out.println(cad1.indexOf("u"));
		System.out.println(cad1.lastIndexOf("u"));
		System.out.println(cad1.length());
		//System.out.println(cad1.replace('a', 'e'));
		
		//separa el string con un identificador, en este caso con una "coma"
		String[] cads= cad1.split(",");
		
		for (int i=0;i<cads.length;i++)
		{
			System.out.println(cads[i]);
		}
		
		System.out.println(cad1.replace('a', 'e'));
		//Algoritmo para invertir un string
		String reverseString=" ";
		
		for(int index=cad1.length()-1;index>=0;index--)
		{
			reverseString=reverseString+cad1.charAt(index);
		}
		System.out.println(reverseString);
		
		//String misNuevasCadenas=" ";
		
		String[] misCadenas = {cad1+cad2};
		String[] misNuevasCadenas = Tuneador.tunea(misCadenas);
		for (int i=0;i<misNuevasCadenas.length;i++)
		{
			System.out.println(misNuevasCadenas);
		}
		
		int[] misEnteros= {2,3,4,5,6,7,};
		
		
		
		
	}

}
