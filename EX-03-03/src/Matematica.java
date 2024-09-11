
public class Matematica {
	public static double pi(int n) {
		double pi = 0;
		for (int i = 0; i < n; i++) {
			pi = pi + (Math.pow(-1, i)/(2*i + 1));
		}
		return 4 * pi;
	}
}
