import java.math.RoundingMode;

import com.google.common.math.*;

public class MathematicalOperations {

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
