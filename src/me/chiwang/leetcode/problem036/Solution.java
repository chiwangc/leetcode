/***********************************************************************************************************************
 * 
 * LeetCode Problem 36. Valid Sudoku
 * 
 * Problem:
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * A partially filled sudoku which is valid.
 * 
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated. 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem036;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
	final Set<Character>[] columnSet = (Set<Character>[]) new Set[9];
	final Set<Character>[] rowSet = (Set<Character>[]) new Set[9];
	final Set<Character>[] regionSet = (Set<Character>[]) new Set[9];
	
	for (int i = 0; i < 9; i++) {
	    columnSet[i] = new HashSet<Character>();
	    rowSet[i] = new HashSet<Character>();
	    regionSet[i] = new HashSet<Character>();
	}
	
	for (int i = 0; i < 9; i++) {	    
	    for (int j = 0; j < 9; j++) {
		if (board[i][j] != '.') {
		    final Character entry = board[i][j];
		    
		    if (columnSet[j].contains(entry)) {
			return false;
		    } else {
			columnSet[j].add(entry);
		    }
		    
		    if (rowSet[i].contains(entry)) {
			return false;
		    } else {
			rowSet[i].add(entry);
		    }
		    
		    if (regionSet[getRegion(i, j)].contains(entry)) {
			return false;
		    } else {
			regionSet[getRegion(i, j)].add(entry);
		    }
		}
	    }
	}
	
	return true;
    }
    
    public static int getRegion(int i, int j) {
	return (i / 3) * 3 + (j / 3);
    }
}