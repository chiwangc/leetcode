/***********************************************************************************************************************
 * 
 * LeetCode Problem 30. Substring with Concatenation of All Words
 * 
 * Problem:
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 * (order does not matter). 
 * 
 ***********************************************************************************************************************/

package me.chiwang.leetcode.problem030;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
	List<Integer> result = new LinkedList<Integer>();

	Map<String, Integer> wordsMap = new HashMap<String, Integer>();
	for (String word : words) {
	    if (wordsMap.containsKey(word)) {
		wordsMap.put(word, wordsMap.get(word) + 1);
	    } else {
		wordsMap.put(word, 1);
	    }
	}
	
	final int wordLength = words[0].length();
	final int numOfWords = words.length;
	
	Map<String, Integer> counterMap = new HashMap<String, Integer>();
	int numOfMatches = 0;
	
	for (int i = 0; i < wordLength; i++) {
	    counterMap.clear();
	    numOfMatches = 0;
	    
	    for (int curr = i; curr <= s.length() - wordLength; curr += wordLength) {
		String currWord = s.substring(curr, curr + wordLength);
		
		if (!wordsMap.containsKey(currWord)) {
		    counterMap.clear();
		    numOfMatches = 0;
		} else {
		    if (numOfMatches == numOfWords) {
			// Check head and tail
			int prev = curr - numOfMatches * wordLength;
			String prevWord = s.substring(prev, prev + wordLength);
			if (currWord.equals(prevWord)) {
			    result.add(prev + wordLength);
			} else {		    
			    while (!prevWord.equals(currWord)) {
				counterMap.put(prevWord, counterMap.get(prevWord) - 1);
				numOfMatches--;
				
				prev += wordLength;
				prevWord = s.substring(prev, prev + wordLength); 
			    }
			}
		    } else {
			int currWordOccur = counterMap.containsKey(currWord) ? counterMap.get(currWord) + 1 : 1;
			if (currWordOccur <= wordsMap.get(currWord)) {
			    // Good!
			    counterMap.put(currWord, currWordOccur);
			    if (++numOfMatches == numOfWords) {
				result.add(curr - (numOfWords - 1) * wordLength);
			    }
			} else {
			    int prev = curr - numOfMatches * wordLength; 
			    String prevWord = s.substring(prev, prev + wordLength);
			    
			    while (!prevWord.equals(currWord)) {
				counterMap.put(prevWord, counterMap.get(prevWord) - 1);
				numOfMatches--;
				
				prev += wordLength;
				prevWord = s.substring(prev, prev + wordLength); 
			    }
			}
			
		    }
		}
	    }
	}

	return result;
    }
}