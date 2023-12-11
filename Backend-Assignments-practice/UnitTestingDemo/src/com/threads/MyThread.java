package com.threads;

public class MyThread extends Thread {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		System.out.println(t1);

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	public int add(int a,int b) {
		a=1;
		b=3;
		return a+b;
	}

}
