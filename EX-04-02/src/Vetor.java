
public class Vetor {
	private double x, y;
	
	public Vetor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	private Vetor() {
		
	}
	
	public Vetor clone() {
		Vetor clone = new Vetor();
		clone.x = this.x;
		clone.y = this.y;
		return clone;
	}
	
	public String toString() {
		String str = "x: %.2f\ny: %.2f";
		String result = String.format(str, x, y);
		return result;
	}
}
