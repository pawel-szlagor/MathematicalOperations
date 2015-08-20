import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MathematicalOperationsTest {

	@Test
	public void testAddNormal() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(mo.add(1, 2), 3);
	}

	@Test(expected = ArithmeticException.class)
	public void testAddOverflow() {
		new MathematicalOperations().add(Integer.MAX_VALUE, 1);
	}

	@Test
	public void testDivisionNormal() throws Exception {
		// given
		MathematicalOperations mo = new MathematicalOperations();
		// when
		double result = mo.division(20, 5, false);
		// then
		Assert.assertEquals(4.0, result);
	}

	@Test
	public void testDivisionByZero() throws Exception {
		// given
		MathematicalOperations mo = new MathematicalOperations();
		boolean hasException = false;
		// when
		try {
			double result = mo.division(20, 0, false);
		} catch (Exception e) {
			hasException = true;
		}
		// then
		Assert.assertEquals(true, hasException);
	}

	@Test
	public void testDivisionRonding() throws Exception {
		// given
		MathematicalOperations mo = new MathematicalOperations();
		// when
		double result = mo.division(20, 3, true);
		// then
		Assert.assertEquals(6.0, result);
	}

}
