/***********************************************************************************************************************
 * 
 * LeetCode Problem 4. Median of Two Sorted Arrays
 * 
 * Problem:
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 *
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem004;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if ((m + n) % 2 == 0) {
        	int k = (m + n) / 2;
        	int m1 = findKthElement(nums1, 0, nums1.length, nums2, 0, nums2.length, k);
        	int m2 = findKthElement(nums1, 0, nums1.length, nums2, 0, nums2.length, k + 1);
        	
        	return ((double) m1 + m2) / 2.0;
        	
        } else {
        	int k = (m + n + 1) / 2; 
        	return findKthElement(nums1, 0, nums1.length, nums2, 0, nums2.length, k);
        }
    }
    
    private int findKthElement(int[] a1, int start1, int len1, int[] a2, int start2, int len2, int k) {
    	// WLOG, assume len1 <= len2
    	if (len1 > len2)
    		return findKthElement(a2, start2, len2, a1, start1, len1, k);
    	
    	if (len1 == 0)
    		return a2[start2 + k - 1];
    	
    	if (k == 1)
    		return min(a1[start1], a2[start2]);
    	
    	int p = min(len1, k / 2);
    	int p1 = a1[start1 + p - 1];
    	int p2 = a2[start2 + p - 1];
    	
    	if (p1 < p2) {
    		return findKthElement(a1, start1 + p, len1 - p, a2, start2, len2, k - p);
    	} else if (p1 > p2) {
    		return findKthElement(a1, start1, len1, a2, start2 + p, len2 - p, k - p);
    	} else {
    		if (2 * p == k) {
    			return p1;
    		} else {
    			return findKthElement(a1, start1 + p, len1 - p, a2, start2 + p, len2 - p, k - 2 * p);
    		}    		
    	}
    }
    
    private int min(int a, int b) {
    	return a > b ? b : a;
    }
}
