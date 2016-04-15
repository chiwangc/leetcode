package me.chiwang.leetcode.problem012;

public class Solution {

    private StringBuilder sb;

    private final String[] lookupIVX = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private final String[] lookupXLC = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private final String[] lookupCDM = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private final String[] lookupM = new String[] {"", "M", "MM", "MMM"};

    public String intToRoman(int num) {

	final StringBuilder sb = new StringBuilder();
	sb.append(lookupM[num / 1000]);
	sb.append(lookupCDM[(num / 100) % 10]);
	sb.append(lookupXLC[(num / 10) % 10]);
	sb.append(lookupIVX[num % 10]);
	
	return sb.toString();
    }

    public static void main(String[] args) {

	Solution solution = new Solution();

	StringBuilder sb = new StringBuilder();
	sb.append("String[] lookup = new String[] {");

	for (int i = 1; i < 1000; i++) {
	    sb.append("\"");
	    sb.append(solution.intToRoman2(i));
	    sb.append("\"");
	    if (i != 999) {
		sb.append(",");
	    }
	}

	sb.append("}");
	System.out.println(sb.toString());
    }

    public String intToRoman2(int num) {

	sb = new StringBuilder();

	int digit = num % 10;
	if (digit != 0) {
	    handleIVX(digit);
	}

	num = num / 10;
	if (num == 0) {
	    return sb.reverse().toString();
	}

	digit = num % 10;
	if (digit != 0) {
	    handleXLC(digit);
	}

	num = num / 10;
	if (num == 0) {
	    return sb.reverse().toString();
	}

	digit = num % 10;
	if (digit != 0) {
	    handleCDM(digit);
	}

	num = num / 10;
	for (int i = 0; i < num; i++) {
	    sb.append("M");
	}

	return sb.reverse().toString();
    }

    private void handleIVX(int digit) {

	if (digit == 1) {
	    sb.append("I");
	} else if (digit == 2) {
	    sb.append("II");
	} else if (digit == 3) {
	    sb.append("III");
	} else if (digit == 4) {
	    sb.append("VI");
	} else if (digit == 5) {
	    sb.append("V");
	} else if (digit == 6) {
	    sb.append("IV");
	} else if (digit == 7) {
	    sb.append("IIV");
	} else if (digit == 8) {
	    sb.append("IIIV");
	} else if (digit == 9) {
	    sb.append("XI");
	}
    }

    private void handleXLC(int digit) {

	if (digit == 1) {
	    sb.append("X");
	} else if (digit == 2) {
	    sb.append("XX");
	} else if (digit == 3) {
	    sb.append("XXX");
	} else if (digit == 4) {
	    sb.append("LX");
	} else if (digit == 5) {
	    sb.append("L");
	} else if (digit == 6) {
	    sb.append("XL");
	} else if (digit == 7) {
	    sb.append("XXL");
	} else if (digit == 8) {
	    sb.append("XXXL");
	} else if (digit == 9) {
	    sb.append("CX");
	}
    }

    private void handleCDM(int digit) {

	if (digit == 1) {
	    sb.append("C");
	} else if (digit == 2) {
	    sb.append("CC");
	} else if (digit == 3) {
	    sb.append("CCC");
	} else if (digit == 4) {
	    sb.append("DC");
	} else if (digit == 5) {
	    sb.append("D");
	} else if (digit == 6) {
	    sb.append("CD");
	} else if (digit == 7) {
	    sb.append("CCD");
	} else if (digit == 8) {
	    sb.append("CCCD");
	} else if (digit == 9) {
	    sb.append("MC");
	}
    }
}
