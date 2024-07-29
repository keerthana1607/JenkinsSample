/**
 * 
 */
package com.keerthana.junittest;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import com.keerthana.junitt.App;

/**
 * 
 */
class AppTest {

	
	@Test
	void testCompareString() {
		assertTrue(App.compareStrings("kee", "kee"));
	}
	@Test
	void testCompareString1() {
		assertFalse(App.compareStrings("Keer", "kee"));
	}

}
