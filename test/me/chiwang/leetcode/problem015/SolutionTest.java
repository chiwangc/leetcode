package me.chiwang.leetcode.problem015;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-1, 0, 1));
	expected.add(Arrays.asList(-1, -1, 2));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase2() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-1, 0, 1));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-1, 0, 1, 2, 3});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase3() {
	List<List<Integer>> expected = new LinkedList<List<Integer>>();	
	List<List<Integer>> result = solution.threeSum(new int[] {1, 2, 3, 4, 5, 6});
	
	assertListEquals(expected, result);
    }    

    @Test
    public void testCase4() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-2, -1, 3));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-2, -1, 1, 2, 3});
	
	assertListEquals(expected, result);
    }

    @Test
    public void testCase5() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-2, -1, 3));
	expected.add(Arrays.asList(-3, 1, 2));
	expected.add(Arrays.asList(-3, -1, 4));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-3, -2, -1, 1, 2, 3, 4});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase6() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-10, 0, 10));
	expected.add(Arrays.asList(-10, 1, 9));
	expected.add(Arrays.asList(-10, 2, 8));
	expected.add(Arrays.asList(-10, 3, 7));
	expected.add(Arrays.asList(-10, 4, 6));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase7() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-2, 0, 2));
	expected.add(Arrays.asList(-2, 1, 1));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-2, 0, 1, 1, 2});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase8() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-1, 0, 1));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-1, -1, 0, 1, 1, 1});
	
	assertListEquals(expected, result);
    }

    @Test
    public void testCase9() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-1, 0, 1));
	expected.add(Arrays.asList(0, 0, 0));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-1, -1, 0, 0, 0, 1, 1, 1});
	
	assertListEquals(expected, result);
    }
    
    @Test
    public void testCase10() {	
	List<List<Integer>> expected = new LinkedList<List<Integer>>();
	expected.add(Arrays.asList(-2, -1, 3));
	expected.add(Arrays.asList(-2, 0, 2));
	expected.add(Arrays.asList(-1, 0, 1));
	
	List<List<Integer>> result = solution.threeSum(new int[] {-2, -1, 0, 1, 2, 3});
	
	assertListEquals(expected, result);
    }
    
    private void assertListEquals(List<List<Integer>> list1, List<List<Integer>> list2) {	
	assertTrue(list1.size() == list2.size());
	
	list1.sort(new ListComparator());
	list2.sort(new ListComparator());
	
	for (int i = 0; i < list1.size(); i++) {
	    for (int j = 0; j < 3; j++) {
		assertTrue(list1.get(i).get(j) == list2.get(i).get(j));
	    }
	}
    }
    
    private static class ListComparator implements Comparator<List<Integer>> {
	@Override
	public int compare(List<Integer> o1, List<Integer> o2) {
	    for (int i = 0; i < o1.size(); i++) {
		if (o1.get(i) > o2.get(i)) {
		    return 1;
		} else if (o1.get(i) < o2.get(i)) {
		    return -1;
		}
	    }
	    return 0;
	}	
    }
}
