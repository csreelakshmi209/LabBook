package com.lab3.stringsParsing;

import java.util.Scanner;

public class MirrorImage {
	void getImage()
	{
		//entering a string
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=scn.nextLine();
		s1=s1.toUpperCase();
		//creating empty string to store the reversed string
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			s2+=s1.charAt(i); 
			
		}
		System.out.print(s1+" | "+s2);
	}
	public static void main(String[] args) {
		MirrorImage image = new MirrorImage();
		image.getImage();
	}
}
