/***********************************************************************************************************************
 * 
 * LeetCode Problem 37. Sudoku Solver
 * 
 * Problem:
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 *
 * Empty cells are indicated by the character '.'.
 *
 * You may assume that there will be only one unique solution.
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem037;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public void solveSudoku(char[][] board) {
	resolve(board, 0);
    }

    private boolean resolve(char[][] board, int idx) {

	if (idx == 81)
	    return true;

	int x = idx / 9;
	int y = idx % 9;

	Set<Character> candidates = getCandidates(board, x, y);

	if (candidates.size() > 0) {
	    boolean needReset = false;

	    for (Character candidate : candidates) {
		needReset = true;
		board[x][y] = candidate;
		if (resolve(board, idx + 1))
		    return true;
	    }

	    if (needReset)
		board[x][y] = '.';
	    return false;
	} else {
	    if (board[x][y] == '.')
		return false;
	    return resolve(board, idx + 1);
	}
    }

    private Set<Character> getCandidates(char[][] board, int x, int y) {

	Set<Character> set = new HashSet<Character>();
	if (board[x][y] != '.')
	    return set;

	set.addAll(Arrays.asList(new Character[] { '1', '2', '3', '4', '5', '6', '7', '8', '9' }));
	// Handle the row, column and box
	for (int i = 0; i < 9; i++) {
	    if (board[x][i] != '.')
		set.remove((Character) board[x][i]);
	    if (board[i][y] != '.')
		set.remove((Character) board[i][y]);
	    if (board[i / 3 + (x / 3) * 3][i % 3 + (y / 3) * 3] != '.')
		set.remove((Character) board[i / 3 + (x / 3) * 3][i % 3 + (y / 3) * 3]);
	}
	return set;
    }
}