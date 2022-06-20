package com.leetcode;

// 9. Palindrome Number
class Solution {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}

	public static boolean isPalindrome(int x) {
		return String.valueOf(x)
				.equals(
						new StringBuilder()
						.append(String.valueOf(x))
						.reverse()
						.toString()
						);
	}
}
