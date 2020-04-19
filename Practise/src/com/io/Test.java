package com.io;

import java.util.Scanner;
import java.lang.*;

public class Test {
	public static void main(String args[])throws java.lang.Exception
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			String ch=sc.next();
			char ch1=ch.charAt(0);
			if(ch1=='B' || ch1=='b')
				System.out.println(" BattleShip");
			else if(ch1=='C' || ch1=='c')
				System.out.println(" Cruiser");
			else if(ch1=='D' || ch1=='d')
				System.out.println(" BattleShip");
			else
				System.out.println(" Frigate");	
			t--;
		}
		}
		catch
		(Exception e)
		{
			System.out.println(e);
		}
	}

}
