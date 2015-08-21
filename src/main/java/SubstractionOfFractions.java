import org.apache.commons.lang3.math.Fraction;

public class SubstractionOfFractions {

	public Fraction substractionOfFractions(Fraction a, Fraction b){
		return a.add(b.negate());
	}
	
}
