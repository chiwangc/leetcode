package me.chiwang.leetcode.problem017;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void testCase1() {
	assertArrayEquals(new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, solution.letterCombinations("23").toArray(new String[0]));
    }
    
    @Test
    public void testCase2() {
	assertArrayEquals(new String[] {}, solution.letterCombinations("").toArray(new String[0]));
    }
    
    @Test
    public void testCase3() {
	assertArrayEquals(new String[] {"a", "b", "c"}, solution.letterCombinations("2").toArray(new String[0]));
    }
    
    @Test
    public void testCase4() {
	assertArrayEquals(new String[] {"aw", "ax", "ay", "az", "bw", "bx", "by", "bz", "cw", "cx", "cy", "cz"}, solution.letterCombinations("29").toArray(new String[0]));
    }
    
    @Test
    public void testCase5() {
	assertArrayEquals(new String[] {"dd", "de", "df", "ed", "ee", "ef", "fd", "fe", "ff"}, solution.letterCombinations("33").toArray(new String[0]));
    }
    
    @Test
    public void testCase6() {
	String[] expected = new String[] {"awa", "axa", "aya", "aza", "bwa", "bxa", "bya", "bza", "cwa", "cxa", "cya", "cza",
		    			  "awb", "axb", "ayb", "azb", "bwb", "bxb", "byb", "bzb", "cwb", "cxb", "cyb", "czb",
		    			  "awc", "axc", "ayc", "azc", "bwc", "bxc", "byc", "bzc", "cwc", "cxc", "cyc", "czc"};
	Arrays.sort(expected);
	
	assertArrayEquals(expected, solution.letterCombinations("292").toArray(new String[0]));
    }
    
    @Test
    public void testCase7() {
	assertArrayEquals(new String[] {"gd", "ge", "gf", "hd", "he", "hf", "id", "ie", "if"}, solution.letterCombinations("43").toArray(new String[0]));
    }
    
    @Test
    public void testCase8() {
	assertArrayEquals(new String[] {"mj", "mk", "ml", "nj", "nk", "nl", "oj", "ok", "ol"}, solution.letterCombinations("65").toArray(new String[0]));
    }
    
    @Test
    public void testCase9() {
	assertArrayEquals(new String[] {"pt", "pu", "pv", "qt", "qu", "qv", "rt", "ru", "rv", "st", "su", "sv"}, solution.letterCombinations("78").toArray(new String[0]));
    }
    
    @Test
    public void testCase10() {
	assertArrayEquals(new String[] {"wp", "wq", "wr", "ws", "xp", "xq", "xr", "xs", "yp", "yq", "yr", "ys", "zp", "zq", "zr", "zs"}, solution.letterCombinations("97").toArray(new String[0]));
    }
}
