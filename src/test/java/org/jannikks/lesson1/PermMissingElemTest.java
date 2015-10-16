package org.jannikks.lesson1;

import org.junit.Assert;

import org.junit.Test;

// Constraints:
// N is an integer within the range [0..100,000];
// the elements of A are all distinct;
// each element of array A is an integer within the range [1..(N + 1)].

public class PermMissingElemTest {
	
	
	
	@Test
	public void frogJumpTest(){
		
		// test case
		Assert.assertEquals(4, PermMissingElem.calcMissingElem(new int[]{2,3,1,5}));
		
		// max value overflow test
		int [] maxArray = new int[100000];
		for (int i = 0; i < maxArray.length; i++){
			maxArray[i] = i+2;
		}
		Assert.assertEquals(1, PermMissingElem.calcMissingElem(maxArray));
		
	}
}
