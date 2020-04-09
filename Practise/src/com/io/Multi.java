package com.io;

public class Multi extends Thread {
	public void run()
	{
		System.out.println("Thread is running"+Thread.currentThread().getName());
		System.out.println("Thread  is running "+Thread.currentThread().getPriority());
	}

	public static void main(String args[])
	{
		Multi m1=new Multi();
		Multi m2=new Multi();
		m1.setPriority(4);
		m2.setPriority(5);
		m1.start();
		m2.start();
		
	    
}
}