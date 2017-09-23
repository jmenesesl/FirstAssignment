/**
 * 
 */
package org.escoladeltreball.firstassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author jmendez
 *
 */
public class ReviewImplTest {

	private static ReviewImpl main;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		main = new ReviewImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.ReviewImpl.Main#frequencyPercentage(int[], int)}.
	 */
	@Test
	public final void testFrequencyPercentage() {
		int[] values = { 3, 4, 3, 5, 1, 2, 3, 0 };
		assertEquals(37.5, main.frequencyPercentage(values, 3), 1e-4);
		assertEquals(12.5, main.frequencyPercentage(values, 1), 1e-4);
		assertEquals(0, main.frequencyPercentage(values, 7), 1e-4);
	}

	@Test
	public final void testMerge() {
		int[] values = { 1, 2, 3, 5, 7, 9, 11, 15 };
		int[] values2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
		assertArrayEquals(new int[] { 0, 1, 2, 3, 5, 7, 9, 11, 15 }, main.merge(values, 0));
		assertArrayEquals(new int[] { 1, 2, 3, 5, 6, 7, 9, 11, 15 }, main.merge(values, 6));
		assertArrayEquals(new int[] { 1, 2, 3, 5, 7, 9, 11, 15, 19 }, main.merge(values, 19));
		assertArrayEquals(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 2 }, main.merge(values2, 2));
		assertArrayEquals(new int[] { 0, 1, 1, 1, 1, 1, 1, 1, 1 }, main.merge(values2, 0));
		assertArrayEquals(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, main.merge(values2, 1));
	}

}
