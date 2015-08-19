import java.math.RoundingMode;

import com.google.common.math.*;
public class MathematicalOperations {
	
	
	
	


	public double division(int a, int b, boolean round) throws Exception {
		if(round)
		return IntMath.divide(a, b, RoundingMode.FLOOR);
		
		return a/b;
	}
	

}
