
public class Main {

	public static void main(String[] args) {
		Vetor v = new Vetor(2.0, 3.0);
		Vetor v1 = v.clone();
		System.out.println(v.toString());
		System.out.println(v1.toString());
	}

}
