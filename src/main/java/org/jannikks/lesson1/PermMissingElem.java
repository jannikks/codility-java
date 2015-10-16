package org.jannikks.lesson1;

/**
 * PermMissingElem Codility Exercise
 * 
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains integers in the range [1..(N + 1)], which means that exactly one
 * element is missing.
 * 
 * Your goal is to find that missing element.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a zero-indexed array A, returns the value of the missing element.
 * 
 * For example, given array A such that: A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5
 * 
 * the function should return 4, as it is the missing element.
 * 
 * @author Christiane Lemke
 * 
 */
public class PermMissingElem {

	private PermMissingElem() {

	}

	public static int calcMissingElem(int[] A) {

		// using long as overflow possible, as max sum is about 5E9, Max signed
		// int is about 2E9
		long highestNumber = A.length + 1;
		long expectedSum = highestNumber * (highestNumber + 1) / 2;

		long actualSum = 0;
		for (int arrayMember : A) {
			actualSum += arrayMember;
		}

		return (int) (expectedSum - actualSum);
	}

}
