package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for StringUtil
 */
@DisplayName("StringUtil Tests")
class StringUtilTest {
    
    private StringUtil stringUtil;
    
    @BeforeEach
    void setUp() {
        stringUtil = new StringUtil();
    }
    
    @Test
    @DisplayName("Test 6: Reverse a string")
    void testReverse() {
        String result = stringUtil.reverse("hello");
        assertEquals("olleh", result, "Reverse of 'hello' should be 'olleh'");
    }
    
    @Test
    @DisplayName("Test 7: Check if string is palindrome")
    void testIsPalindrome() {
        assertTrue(stringUtil.isPalindrome("A man a plan a canal Panama"), 
            "The string should be identified as a palindrome");
        assertFalse(stringUtil.isPalindrome("hello"), 
            "The string 'hello' is not a palindrome");
    }
    
    @Test
    @DisplayName("Test 8: Count vowels in a string")
    void testCountVowels() {
        int count = stringUtil.countVowels("Hello World");
        assertEquals(3, count, "'Hello World' should contain 3 vowels");
    }
    
    @Test
    @DisplayName("Test 9: Capitalize first letter")
    void testCapitalize() {
        String result = stringUtil.capitalize("java");
        assertEquals("Java", result, "First letter should be capitalized");
    }
    
    @Test
    @DisplayName("Test 10: Check if string is null or empty")
    void testIsNullOrEmpty() {
        assertTrue(stringUtil.isNullOrEmpty(null), "null should return true");
        assertTrue(stringUtil.isNullOrEmpty(""), "Empty string should return true");
         assertFalse(stringUtil.isNullOrEmpty("test"), "Non-empty string should return false");
//		assertTrue(stringUtil.isNullOrEmpty("test"), "Non-empty string should return false");
    }
}
