/***********************************************************************************************************************
 * 
 * LeetCode Problem 6. ZigZag Conversion
 * 
 * Problem:
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to 
 * display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 *
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem006;

public class Solution {

    public String convert(String s, int numRows) {
	if (numRows == 1) {
	    return s;
	}

	StringBuilder output = new StringBuilder();

	for (int i = 1; i <= numRows; i++) {
	    addNthRow(s, numRows, i, output);
	}

	return output.toString();
    }

    private void addNthRow(String s, int numRows, int n, StringBuilder output) {
	for (int i = 0; i < s.length(); i += (2 * numRows - 2)) {
	    if (n == 1) {
		output.append(s.charAt(i));
	    } else if (n == numRows) {
		final int idx = i + numRows - 1;
		if (idx < s.length()) {
		    output.append(s.charAt(idx));
		}
	    } else {
		final int idx1 = i + n - 1;
		final int idx2 = i + 2 * numRows - n - 1;

		if (idx1 < s.length()) {
		    output.append(s.charAt(idx1));
		}
		if (idx2 < s.length()) {
		    output.append(s.charAt(idx2));
		}
	    }
	}
    }
}
