package com.epam.RemoveA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromFirst2CharsTest {
	
	
	/*
	 * TODO list :
	 * 
	 * 1. More Than 2 Chars : "ABCD" => "BCD" - success
	 * 2. More Than 2 Chars : "AACD" => "CD" - success
	 * 3. More Than 2 Chars : "BACD" => "BCD" - success
	 * 4. More Than 2 Chars : "BBCD" => "BBCD" - success
	 * 5. More Than 2 Chars : "BBAA" => "BBAA" - success
	 * 6. More Than 2 Chars : "AABAA" => "BAA" - success
	 * 7. Empty String : "" => "" - success
	 * 8. 1 Char : "A" => "" - success
	 * 9. 1 Char : "B" => "B" - success
	 * 10. 2 Chars : "AA" => "" - success
	 * 11. 2 Chars : "AB" => "B" - success
	 * 12. 2 Chars : "BA" => "B" - success
	 * 13. 2 Chars : "BB" => "BB" - success
	 * 
	 */
	
	RemoveAFromFirst2Chars removeA;
	
	@BeforeEach
	void beforeEach() {
		removeA = new RemoveAFromFirst2Chars();
	}
	
	@Test
	void testRemoveMoreThan2CharsType1() {
		assertEquals("BCD", removeA.remove("ABCD"));
	}
	
	@Test
	void testRemoveMoreThan2CharsType2() {
		assertEquals("CD", removeA.remove("AACD"));
	}
	
	@Test
	void testRemoveMoreThan2CharsType3() {
		assertEquals("BCD", removeA.remove("BACD"));
	}
	
	@Test
	void testRemoveMoreThan2CharsType4() {
		assertEquals("BBCD", removeA.remove("BBCD"));
	}
	
	@Test
	void testRemoveMoreThan2CharsType5() {
		assertEquals("BBAA", removeA.remove("BBAA"));
	}
	
	@Test
	void testRemoveMoreThan2CharsType6() {
		assertEquals("BAA", removeA.remove("AABAA"));
	}
	
	@Test
	void testRemoveEmpty() {
		assertEquals("", removeA.remove(""));
	}
	
	@Test
	void testRemoveOneCharType1() {
		assertEquals("", removeA.remove("A"));
	}
	
	@Test
	void testRemoveOneCharType2() {
		assertEquals("B", removeA.remove("B"));
	}
	
	@Test
	void testRemoveTwoCharsType1() {
		assertEquals("", removeA.remove("AA"));
	}
	
	@Test
	void testRemoveTwoCharsType2() {
		assertEquals("B", removeA.remove("AB"));
	}
	
	@Test
	void testRemoveTwoCharsType3() {
		assertEquals("B", removeA.remove("BA"));
	}
	
	@Test
	void testRemoveTwoCharsType4() {
		assertEquals("BB", removeA.remove("BB"));
	}
}