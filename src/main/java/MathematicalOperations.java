import java.math.RoundingMode;

import com.google.common.math.*;
public class MathematicalOperations {
	
	
	
	

	/**
	 * @throws ArithmeticException if the result overflows the {@link Integer#MAX_VALUE}
	 */
	public int add(int a, int b) throws ArithmeticException {
		return IntMath.checkedAdd(a, b);
	}

	public double division(int a, int b, boolean round) throws Exception {
		if(round)
		return IntMath.divide(a, b, RoundingMode.FLOOR);
		
		return a/b;
	}
	

}
