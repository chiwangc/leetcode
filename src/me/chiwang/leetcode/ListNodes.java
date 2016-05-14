package me.chiwang.leetcode;

public class ListNodes {
	
	public static ListNode getListNodes(int... vals) {
		final int n = vals.length;
		ListNode[] listNodes = new ListNode[n];
		
		for (int i = 0; i < n; i++) {
			listNodes[i] = new ListNode(i + 1);
			if (i != n - 1) {
				listNodes[i].next = listNodes[i + 1];
			}
		}
		
		return listNodes[0];
	}
}
