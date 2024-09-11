
public class Vetor {
	private double x;
	private double y;
	
	public Vetor(double novo_x, double novo_y) {
		x = novo_x;
		y = novo_y;
	}
	
	
	public static Vetor soma(Vetor v1, Vetor v2) {
		Vetor v3 = new Vetor(v1.x + v2.x, v1.y + v2.y);
		
		return v3;
	}
	
	public void exibe() {
		System.out.printf("x = %5.2f\ny = %5.2f\n\n", x, y);
	}
}
