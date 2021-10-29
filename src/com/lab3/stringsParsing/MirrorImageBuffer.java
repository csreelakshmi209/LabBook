package com.lab3.stringsParsing;

import java.util.Scanner;

public class MirrorImageBuffer {
	void getImage() {
		// entering a string
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the string:");
		String s1 = scn.nextLine();
		s1 = s1.toUpperCase();

		// using stringBuffer reverse method and reversing a string
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println(s1 + " | " + sb);
	}

	public static void main(String[] args) {
		MirrorImageBuffer imageBuffer = new MirrorImageBuffer();
		imageBuffer.getImage();
	}
}
