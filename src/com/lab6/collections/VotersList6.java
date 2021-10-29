package com.lab6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VotersList6 {
	public List votersList(int id,int age)
	{
		
		if(age>=18)
		{
			//System.out.println("your age is "+age+" so you are eligible for vote");
			
			List l1=new ArrayList();
			l1.add(age);
			//System.out.println("the list of data who are eligible to vote: ");
			System.out.println(id+"->"+age);
			
		}
		
		return null;
	}
	public static void main(String[] args) {
		VotersList6 v1 = new VotersList6();
		Map<Integer,Integer> m1=new HashMap<>();
		m1.put(1000,20);
		m1.put(1001,12);
		m1.put(1002,22);
		m1.put(1003,18);
		m1.put(1004,17);
		m1.put(1005,25);
		Iterator il=m1.entrySet().iterator();

		while(il.hasNext())
		{
			Map.Entry record=(Map.Entry) il.next();
			Integer key=(Integer) record.getKey();
			Integer value=(Integer) record.getValue();
			
			//System.out.println(key+"->"+value);
			
			v1.votersList(key, value);
		}
		
	}
	
}
