package me.chiwang.leetcode.problem040;

import java.util.List;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void test() {
	int[] candidates = new int[] {10,1,2,7,6,1,5};
	int target = 8;
	
	for (List<Integer> result : solution.combinationSum2(candidates, target)) {
	    System.out.println(result);
	}
    }

}
