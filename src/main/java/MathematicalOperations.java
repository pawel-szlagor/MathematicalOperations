import java.math.RoundingMode;

import com.google.common.math.*;

<<<<<<< HEAD
	/**
	 * @throws ArithmeticException if the result overflows the {@link Integer#MAX_VALUE}
	 */
	public int add(int a, int b) throws ArithmeticException {
		return IntMath.checkedAdd(a, b);
	}
=======
public class MathematicalOperations {
>>>>>>> master

	public double division(int a, int b, boolean round) throws Exception {
		if (round)
			return IntMath.divide(a, b, RoundingMode.FLOOR);

		return a / b;
	}

	public int substraction(int a, int b) {
		long result = (long) a - (long) b;
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException("overflow: subtract");
		}
		return (int) result;
	}
}
