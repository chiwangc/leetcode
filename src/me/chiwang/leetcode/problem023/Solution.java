package me.chiwang.leetcode.problem023;

public class Solution {
	
    public ListNode mergeKLists(ListNode[] lists) {
    	if (lists.length == 0)
    		return null;
    	
        ListNode[] result = lists;
        
        while (result.length != 1) {
        	ListNode[] tmp = nPass(result);
        	result = tmp;
        }
        
        return result[0];
    }
    
    private ListNode[] nPass(ListNode[] lists) {
    	ListNode[] result = new ListNode[(lists.length + 1) / 2];
    	
    	for (int i = 0; i < result.length - 1; i++) {
    		result[i] = mergeLists(lists[2 * i], lists[2 * i + 1]);
    	}
    	
    	if (lists.length == result.length * 2) {
    		result[result.length - 1] = mergeLists(lists[lists.length - 2], lists[lists.length - 1]);
    	} else {
    		result[result.length - 1] = lists[lists.length - 1];
    	}
    	
    	return result;
    }
    
    private ListNode mergeLists(ListNode list1, ListNode list2) {
    	ListNode result = new ListNode(0);
    	ListNode curr = result;
    	
    	while (list1 != null && list2 != null) {
    		if (list1.val < list2.val) {
        		curr.next = list1;
        		list1 = list1.next;
        	} else {
        		curr.next = list2;
        		list2 = list2.next;
        	}
    		curr = curr.next;
    	}
    	
    	while (list1 != null) {
    		curr.next = list1;
    		list1 = list1.next;
    		curr = curr.next;
    	}
    	 
    	while (list2 != null) {
    		curr.next = list2;
    		list2 = list2.next;
    		curr = curr.next;
    	}

    	return result.next;
    }
    
    private static class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(1);
    	ListNode l2 = new ListNode(2);
    	ListNode l3 = new ListNode(3);
    	ListNode l4 = new ListNode(4);
    	ListNode l5 = new ListNode(5);
    	ListNode l6 = new ListNode(6);
    	ListNode l7 = new ListNode(7);
    	ListNode l8 = new ListNode(8);
   	
    	ListNode[] lists = new ListNode[4];
    	lists[0] = l1;
    	l1.next = l2;
    	lists[1] = l3;
    	l3.next = l4;
    	lists[2] = l5;
    	l5.next = l6;
    	lists[3] = l7;
    	l7.next = l8;
    	
    	Solution solution = new Solution();
    	
    	ListNode head = solution.mergeKLists(lists);
    
    	while (head != null) {
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
}
