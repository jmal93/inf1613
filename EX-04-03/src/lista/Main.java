package lista;

public class Main {

	public static void main(String[] args) {
		Vetor v1 = new Vetor(1.0, 2.0);
		Vetor v2 = new Vetor(5.0, 5.0);
		Vetor v3 = new Vetor(8.0, 7.0);
		Vetor v4 = new Vetor(6.9, 6.9);
		
		Lista lst = new Lista();
		lst.insIni(v1);
		lst.insFin(v2);
		lst.insFin(v3);
		lst.insIni(v4);
		lst.posIni();
		Object atual = lst.prox();
		while (atual != null) {
			System.out.println(atual);
			System.out.println("\n");
			atual = lst.prox();
		}
	}

}
