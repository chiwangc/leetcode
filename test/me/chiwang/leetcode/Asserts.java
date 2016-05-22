package me.chiwang.leetcode;

import static org.junit.Assert.*;

public class Asserts {

    public static void assertListNodeEquals(ListNode l1, ListNode l2) {
	if (l1 != null && l2 != null) {
	    assertEquals(l1.val, l2.val);
	    assertListNodeEquals(l1.next, l2.next);
	} else {
	    assertNull(l1);
	    assertNull(l2);
	}

    }
}
