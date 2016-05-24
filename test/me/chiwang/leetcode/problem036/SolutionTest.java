package me.chiwang.leetcode.problem036;

import static org.junit.Assert.*;

import org.junit.Test;

import me.chiwang.leetcode.Sudokus;

public class SolutionTest {
    
    private Solution solution = new Solution();

    @Test
    public void testCase1() {
	char[][] sudoku = Sudokus.get(".........","4........","......6..","...38....",".5...6..1","8......6.",".........","..7.9....","...6.....");
	assertEquals(true, solution.isValidSudoku(sudoku));
    }

    @Test
    public void testCase2() {
	char[][] sudoku = Sudokus.get(".........","4........","4.....6..","...38....",".5...6..1","8......6.",".........","..7.9....","...6.....");
	assertEquals(false, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase3() {
	char[][] sudoku = Sudokus.get(".........",".........",".........",".........",".........",".........",".........",".........",".........");
	assertEquals(true, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase4() {
	char[][] sudoku = Sudokus.get("534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","345286179");
	assertEquals(true, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase5() {
	char[][] sudoku = Sudokus.get("123456789",".12345678","..1234567","...123456","....12345",".....1234","......123",".......12","........1");
	assertEquals(false, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase6() {
	char[][] sudoku = Sudokus.get("534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","34528617.");
	assertEquals(true, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase7() {
	char[][] sudoku = Sudokus.get("1........",".........","..1......",".........",".........",".........",".........",".........",".........");
	assertEquals(false, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase8() {
	char[][] sudoku = Sudokus.get("1........",".........",".........",".........",".........",".........",".........",".........","1........");
	assertEquals(false, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase9() {
	char[][] sudoku = Sudokus.get("1.......1",".........",".........",".........",".........",".........",".........",".........",".........");
	assertEquals(false, solution.isValidSudoku(sudoku));
    }
    
    @Test
    public void testCase10() {
	char[][] sudoku = Sudokus.get("1........",".2.......","..3......","...4.....","....5....",".....6...","......7..",".......8.","........9");
	assertEquals(true, solution.isValidSudoku(sudoku));
    }
}
