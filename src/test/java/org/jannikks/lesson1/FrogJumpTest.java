package org.jannikks.lesson1;

import org.junit.Assert;

import org.junit.Test;

// Constraints:
// X, Y and D are integers within the range [1..1,000,000,000];
// X ≤ Y.


public class FrogJumpTest {
	
	@Test
	public void frogJumpTest(){
		// test case
		Assert.assertEquals(3, FrogJump.calculateJumps(10, 85, 30));
		
		// hit-the-spot case
		Assert.assertEquals(3, FrogJump.calculateJumps(1, 91, 30));
		
		// X==Y case
		Assert.assertEquals(0, FrogJump.calculateJumps(5, 5, 1));
		
		// big number cases
		Assert.assertEquals((int)1E9, FrogJump.calculateJumps(1, (int)1E9+1, 1));
		Assert.assertEquals(1, FrogJump.calculateJumps(1, (int)1E9, (int)1E9));
		
	}

}
