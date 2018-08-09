
public class NumberUtils {

	
	public static boolean hasZero(int n) {
		if (n == 0) {
			return true;
		}
		
		boolean foundZero = false;
		while (n > 0) {
			if (isLastDigitZero(n)) {
				foundZero = true;
				break;
			}
			n /= 10;
		}
		return foundZero;
	}
	
	public static boolean isLastDigitZero(int n) {
		return n % 10 == 0;
	}
	
	public static boolean isAscOrder(int n) {
		int prev = 100000;
		boolean inAscOrder = true;
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit > prev) {
				inAscOrder = false;
				break;
			}
			prev = lastDigit;
			n /= 10;
		}
		return inAscOrder;
	}
}
