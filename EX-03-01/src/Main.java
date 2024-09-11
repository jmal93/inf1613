
public class Main {

	public static void main(String[] args) {
		Vetor v1 = new Vetor(3.0, 4.0);
		Vetor v2 = new Vetor(7.0, 6.0);
		Vetor v3 = Vetor.soma(v1, v2);
		
		v1.exibe();
		v2.exibe();
		v3.exibe();
	}

}
