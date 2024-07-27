/**
 * 
 */
package com.keerthana.Junit;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

/**
 * 
 */
class AppTest {

	
	@Test
	void testCompareString() {
		assertTrue(App.CompareString("kee", "kee"));
	}
	@Test
	void testCompareString1() {
		assertFalse(App.CompareString("Keer", "kee"));
	}

}
