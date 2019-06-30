package com.se465.subscription;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public class HashIdHandler {
	/**
	* static Singleton instance.
	*/
	private static volatile HashIdHandler instance;
	private MessageDigest md;

	/**
	* Private constructor for singleton.
	*/
	private HashIdHandler() {
		try {
			this.md = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	    
	}

	/**
	* Return a singleton instance of HashIdHandler.
	*/
	public static HashIdHandler getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (HashIdHandler.class) {
				if (instance == null) {
					instance = new HashIdHandler();
				}
			}
		}
		return instance;
	}

	public String generateId(String password) {
	    this.md.update(password.getBytes());
	    byte[] digest = this.md.digest();
	    String myHash = DatatypeConverter
	      .printHexBinary(digest).toUpperCase();
		return myHash;
	}
}
