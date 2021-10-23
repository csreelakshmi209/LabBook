package com.lab4.cg.eis.pl;

import java.security.Provider.Service;
import java.util.Scanner;

public class ServiceTest {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			int idNum=scn.nextInt();
			System.out.println("enter id num");
			String name=scn.nextLine();
			System.out.println("enter name");
			double salary=scn.nextDouble();
			System.out.println("enter salary");
			String designation=scn.nextLine();
			System.out.println("enter designation");
			String insuranceScheme=scn.nextLine();
			System.out.println("enter insurance scheme");
			
			
			//ServiceInterface service=new Service();
			//service.retirement();
	}
}
