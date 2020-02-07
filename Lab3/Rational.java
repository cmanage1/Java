import java.lang.Math;

public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
	     // Your code here
        this(numerator, 1);
    }

    public Rational(int numerator, int denominator) {
        if (denominator < 0){
            denominator *= (-1);
            numerator *= (-1);
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // getters

    public int getNumerator() {
	     return numerator;
    }

    public int getDenominator() {
	     return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
        int tempDenominator = denominator *other.denominator;

        int tempNumerator = numerator * other.denominator;
        int tempOtherNumerator = other.numerator * denominator;
        int sum = tempNumerator + tempOtherNumerator;

	    return new Rational(sum, tempDenominator);
    }

    public static Rational plus(Rational a, Rational b) {
    	return a.plus(b);
    }

    // Transforms this number into its reduced form

    private void reduce() {
      if (numerator ==0){
          denominator =1;
      }
      else{
          int commonFactor = gcd(Math.abs(numerator), denominator);
          numerator /= commonFactor;
          denominator /=commonFactor;
      }
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
      // Note that the loop below, as-is, will time out on negative inputs.
      // The gcd should always be a positive number.
      // Add code here to pre-process the inputs so this doesn't happen.

    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
      int thisNewNum = other.denominator * numerator;
      int otherNewNum = other.numerator * denominator;

      return (thisNewNum - otherNewNum);
    }

    public boolean equals(Rational other) {
     return (numerator ==other.numerator && denominator == other.denominator);
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    result = Integer.toString(numerator);
    	} else {
    	    result = numerator +"/" +denominator;
    	}
    	return result;
    }

}
