package com.se465.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class EmailThread extends Thread {
	
	
	@Getter
	@Setter
	private String md5;
	
	@Getter
	@Setter
	private Thread thread;

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		this.thread.start();
	}
	
	

}
