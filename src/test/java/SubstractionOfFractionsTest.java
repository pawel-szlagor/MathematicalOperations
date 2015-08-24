import static org.junit.Assert.*;

import org.apache.commons.lang3.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */

/**
 * @author PSZLAGOR
 *
 */
public class SubstractionOfFractionsTest {

	@Test
	public void testSubstractionPositive() {
		//given
		SubstractionOfFractions sub = new SubstractionOfFractions();
		//when
		Fraction result =sub.substractionOfFractions(Fraction.ONE_HALF, Fraction.ONE_QUARTER);
		//then
		Assert.assertTrue(result.equals(Fraction.ONE_QUARTER));		
	}
	
	@Test
	public void testSubstractionNegative() {
		//given
		SubstractionOfFractions sub = new SubstractionOfFractions();
		//when
		Fraction result =sub.substractionOfFractions(Fraction.ONE_HALF, Fraction.TWO_THIRDS);
		//then
		Assert.assertTrue(result.equals(Fraction.getFraction(-1, 6)));		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSubstractionWithOverflow() {
		//given
		SubstractionOfFractions sub = new SubstractionOfFractions();		
		//when then
		sub.substractionOfFractions(Fraction.getFraction(Integer.MAX_VALUE, 1), Fraction.TWO_THIRDS.negate());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testSubstractionWithUnderflow() {
		//given
		SubstractionOfFractions sub = new SubstractionOfFractions();		
		//when then
		sub.substractionOfFractions(Fraction.getFraction(Integer.MIN_VALUE, 1), Fraction.TWO_THIRDS);
	}
}
