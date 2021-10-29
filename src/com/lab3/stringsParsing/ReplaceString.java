package com.lab3.stringsParsing;

import java.util.Scanner;

public class ReplaceString {
	void alterString()
	{
		//entering a string
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=scn.nextLine();		
		
		char[]ch=s1.toLowerCase().toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			char c=ch[i];
			if(c=='z')
				c='b';

			else if(c!='a' || c!='e' || c!='i' || c!='o' || c!='u')
			{
				c++;
			}
//			else
//				c=(char) (c+1);
			
			System.out.println(ch[i]=c);
			
		}
		
		
	}
	public static void main(String[] args) {
		ReplaceString string = new ReplaceString();
		string.alterString();
	}
		
}
