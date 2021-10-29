package com.lab8.MultiThreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDataThread extends Thread {

	@Override
	public void run() {
		
	}
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\files\\source.txt");
		byte[] array=new byte[(int) f.length()];
		try {
			//here giving the path for the file
			FileInputStream source=new FileInputStream("D:\\files\\source.txt");
			FileOutputStream target=new FileOutputStream("D:\\files\\target.txt");

			//reading source file
			source.read(array);
			//writing all data to new file
			target.write(array);
			
			int s1=array.length;
			//getting the length
			System.out.println(s1);
			
			if(s1<=10  )
			{
				if(s1==10)
				System.out.println("10 characters are copied");
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			
			
			
			
			//closing the resources
			source.close();
			target.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
