package me.chiwang.leetcode.problem018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    private static Comparator<List<Integer>> comparator = new Comparator<List<Integer>>() {
	@Override
	public int compare(List<Integer> o1, List<Integer> o2) {
	    
	    int minSize = o1.size() > o2.size() ? o2.size() : o1.size();	    
	    for (int i = 0; i < minSize; i++) {
		if (o1.get(i) > o2.get(i)) {
		    return 1;
		} else if (o1.get(i) < o2.get(i)) {
		    return -1;
		}
	    }
	    
	    if (o1.size() > o2.size()) {
		return 1;
	    } else if (o1.size() < o2.size()) {
		return -1;
	    } else {
	        return 0;
	    }
	}
    };
    
    @Test
    public void testCase1() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {-1, 0, 0, 1}));
	expected.add(Arrays.asList(new Integer[] {-2, -1, 1, 2}));
	expected.add(Arrays.asList(new Integer[] {-2, 0, 0, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase2() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	List<List<Integer>> computed = solution.fourSum(new int[] {1, 2}, 0);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase3() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	List<List<Integer>> computed = solution.fourSum(new int[] {1, 1, 1, 1}, 0);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase4() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {1, 1, 1, 1}));
	List<List<Integer>> computed = solution.fourSum(new int[] {1, 1, 1, 1, 1}, 4);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase5() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {-3, 0, 1, 3}));
	expected.add(Arrays.asList(new Integer[] {-3, -1, 2, 3}));
	expected.add(Arrays.asList(new Integer[] {-2, -1, 1, 3}));
	expected.add(Arrays.asList(new Integer[] {-2, 0, 1, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {-3, -2, -1, 0, 1, 2, 3}, 1);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase6() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {0, 0, 1, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, 3);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase7() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {0, 0, 1, 3}));
	expected.add(Arrays.asList(new Integer[] {0, 0, 2, 2}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 1, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, 4);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase8() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {0, 0, 1, 4}));
	expected.add(Arrays.asList(new Integer[] {0, 0, 2, 3}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 1, 3}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 2, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, 5);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase9() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {0, 0, 2, 4}));
	expected.add(Arrays.asList(new Integer[] {0, 0, 3, 3}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 1, 4}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 2, 3}));
	expected.add(Arrays.asList(new Integer[] {1, 1, 2, 2}));
	List<List<Integer>> computed = solution.fourSum(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, 6);
	
	assertIntegerListEquals(expected, computed);
    }
    
    @Test
    public void testCase10() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(new Integer[] {0, 0, 3, 4}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 2, 4}));
	expected.add(Arrays.asList(new Integer[] {0, 1, 3, 3}));
	expected.add(Arrays.asList(new Integer[] {0, 2, 2, 3}));
	expected.add(Arrays.asList(new Integer[] {1, 1, 2, 3}));
	List<List<Integer>> computed = solution.fourSum(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, 7);
	
	assertIntegerListEquals(expected, computed);
    }
    
    private void assertIntegerListEquals(List<List<Integer>> l1, List<List<Integer>> l2) {
	assertEquals(l1.size(), l2.size());
	
	l1.sort(comparator);
	l2.sort(comparator);
	
	for (int i = 0; i < l1.size(); i++) {
	    assertEquals(l1.get(i), l2.get(i));
	}
    }

}
