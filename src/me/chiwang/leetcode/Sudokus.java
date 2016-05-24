package me.chiwang.leetcode;

public final class Sudokus {
    
    public static char[][] get(String... entries) {
	char[][] sudoku = new char[9][9];
	for (int i = 0; i < 9; i++) {
	    for (int j = 0; j < 9; j++) {
		sudoku[i][j] = entries[i].charAt(j);
	    }
	}
	return sudoku;
    }

}
