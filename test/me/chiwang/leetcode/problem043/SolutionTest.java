package me.chiwang.leetcode.problem043;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertEquals("56088", solution.multiply("123", "456"));
    }
    
    @Test
    public void testCase2() {
	assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
    }
    
    @Test
    public void testCase3() {
	assertEquals("0", solution.multiply("123456789", "0"));
    }
    
    @Test
    public void testCase4() {
	assertEquals("0", solution.multiply("341", "0"));
    }
    
    @Test
    public void testCase5() {
	assertEquals("0", solution.multiply("0", "7123"));
    }
    
    @Test
    public void testCase6() {
	assertEquals("631163366025793", solution.multiply("1231261", "512615413"));
    }
    
    @Test
    public void testCase7() {
	assertEquals("631163366025793", solution.multiply("1231261", "512615413"));
    }
    
    @Test
    public void testCase8() {
	assertEquals("3143463179000000", solution.multiply("3143463179", "1000000"));
    }
    
    @Test
    public void testCase9() {
	assertEquals("10000000000000", solution.multiply("2000000", "5000000"));
    }
    
    @Test
    public void testCase10() {
	assertEquals("359447345387508252", solution.multiply("871253124", "412563623"));
    }
}
