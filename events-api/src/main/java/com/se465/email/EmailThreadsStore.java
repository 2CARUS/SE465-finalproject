package com.se465.email;

import java.util.ArrayList;

public class EmailThreadsStore {
	/**
	* static Singleton instance.
	*/
	private static volatile EmailThreadsStore instance;
	
	private ArrayList<EmailThread> emailThreads;
	
	/**
	* Private constructor for singleton.
	*/
	private EmailThreadsStore() {
		this.emailThreads = new ArrayList<>();
	}
	
	
	/**
	* Return a singleton instance of EmailThreads.
	*/
	public static EmailThreadsStore getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (EmailThreadsStore.class) {
				if (instance == null) {
					instance = new EmailThreadsStore();
				}
			}
		}
		return instance;
	}

	public void add(EmailThread emailThread) {
		// TODO Auto-generated method stub
		if (emailThread == null) {
			throw new NullPointerException("Email thread was null; oh no!");
		} else {
			this.emailThreads.add(emailThread);
		}
		
	}

	public void addAndStart(EmailThread emailThread) {
		this.add(emailThread);
		// TODO Auto-generated method stub
		this.emailThreads.get(this.emailThreads.size() - 1).start();
		
	}
}
