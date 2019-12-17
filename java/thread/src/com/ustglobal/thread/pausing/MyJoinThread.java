package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread{
@Override
public void  run() {
	for(int i =0; i<10;i++) {
		System.out.println("Myjoin thread");
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
