package me.chiwang.leetcode.problem030;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	List<Integer> expected = Arrays.asList(new Integer[] {0, 9});
	List<Integer> result = solution.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase2() {
	List<Integer> expected = Arrays.asList(new Integer[] {0, 3, 6});
	List<Integer> result = solution.findSubstring("barfoobarfoo", new String[] {"foo", "bar"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase3() {
	List<Integer> expected = Arrays.asList(new Integer[] {0, 2, 4, 6});
	List<Integer> result = solution.findSubstring("ababababab", new String[] {"ab", "ab"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase4() {
	List<Integer> expected = Arrays.asList(new Integer[] {});
	List<Integer> result = solution.findSubstring("ababababab", new String[] {"ab", "ba"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }

    @Test
    public void testCase5() {
	List<Integer> expected = Arrays.asList(new Integer[] {0, 2, 4});
	List<Integer> result = solution.findSubstring("abababab", new String[] {"a","b","a"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase6() {
	List<Integer> expected = Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5});
	List<Integer> result = solution.findSubstring("aaaaaaaaa", new String[] {"aa", "aa"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase7() {
	List<Integer> expected = Arrays.asList(new Integer[] {});
	List<Integer> result = solution.findSubstring("aa", new String[] {"aab", "abb"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase8() {
	List<Integer> expected = Arrays.asList(new Integer[] {6, 9, 12});
	List<Integer> result = solution.findSubstring("barfoofoobarthefoobarman", new String[] {"bar","foo","the"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase9() {
	List<Integer> expected = Arrays.asList(new Integer[] {8});
	List<Integer> result = solution.findSubstring("wordgoodgoodgoodbestword", new String[] {"word","good","best","good"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
    
    @Test
    public void testCase10() {
	List<Integer> expected = Arrays.asList(new Integer[] {16, 20});
	List<Integer> result = solution.findSubstring("wordgoodbestwordbestwordgoodgoodbest", new String[] {"word","good","best","good"});
	Collections.sort(result);
	
	assertEquals(expected, result);
    }
}
