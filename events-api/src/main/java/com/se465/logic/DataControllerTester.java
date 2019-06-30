package com.se465.logic;

import static org.junit.Assert.assertTrue;

public class DataControllerTester {
	public static void main(String[] args) {
		String uid = "4188870";
		assertTrue(DataController.getInstance().searchEvent(uid) != null);
		assertTrue(DataController.getInstance().searchEvent(uid).getUid().equals(uid));
	}
}
