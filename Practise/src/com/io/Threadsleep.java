package com.io;

public class Threadsleep  extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try
		{

			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
	
	public static void main(String args[])
	{
		Threadsleep t1=new Threadsleep();
		Threadsleep t2=new Threadsleep();
		t1.start();
		t2.start();
	}

}
