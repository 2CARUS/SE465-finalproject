package com.se465.data;

import static org.junit.Assert.assertTrue;

public class DataHandlerTest {
	public static void main(String[] args) {
		String uid = "4188870";
		assertTrue(DataHandler.getInstance().searchEvent(uid) != null);
		assertTrue(DataHandler.getInstance().searchEvent(uid).getUid().equals(uid));
	}
}
