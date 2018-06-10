package IntroToJUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class MoreAndMoreTests {
	Methods m = new Methods();

	@Test
	public void MultTest() {
		assertEquals("10 x 0 = 0", m.multiply(10, 0));
		assertEquals("10 x 10 = 100", m.multiply(10, 10));
		assertEquals("8 x 11 = 88", m.multiply(8, 11));
	}

	@Test
	public void PrimeTest() {

		assertTrue(m.isPrime(3));
		assertTrue(m.isPrime(5));
		assertTrue(m.isPrime(541));
		assertFalse(m.isPrime(4));
		assertFalse(m.isPrime(12));
		assertFalse(m.isPrime(527));

	}

	@Test
	public void SquareTest() {

		assertTrue(m.isSquare(4));
		assertTrue(m.isSquare(144));
		assertTrue(m.isSquare(64));
		assertTrue(m.isSquare(10201));
		assertTrue(m.isSquare(1));
		assertFalse(m.isSquare(3));
		assertFalse(m.isSquare(22));
		assertFalse(m.isSquare(143));

	}

	@Test
	public void CubeTest() {

		assertTrue(m.isCube(27));
		assertTrue(m.isCube(216));
		assertTrue(m.isCube(729));
		assertTrue(m.isCube(1));
		assertFalse(m.isCube(3));
		assertFalse(m.isCube(22));
		assertFalse(m.isCube(143));

	}

}
