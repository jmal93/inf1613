
public class Main {

	public static void main(String[] args) {
		Vetor v=new Vetor();

		v.x=3.0;
		v.y=4.0;

		double mod=Math.sqrt(Math.pow(v.x,2.0)+Math.pow(v.y,2.0));
		System.out.printf("Módulo=%.1f",mod);

	}

}
