
public class Voo {
	private Assento assentos[][];
	private int nFila;
	private int nAssentos;
	
	public Voo(int nf, int na) {
		nFila = nf;
		nAssentos = na;
		assentos = new Assento[nf][na];
		
		for (int i = 0; i < nFila; i++) {
			for (int j = 0; j < nAssentos; j++) {
				assentos[i][j] = new Assento(i + 1, (char)(j + 65));
			}
		}
	}
	
	public boolean reserva(int f, char a) {
		Assento assento = assentos[f-1][(int)(a-65)];
		if (!assento.getEstado()) {
			return false;
		}
		
		assento.reserva();
		return true;
	}
	
	public void imprimeMapa() {
		System.out.printf("     ");
		for (int i = 0; i < nAssentos; i++) {
			System.out.printf("%c ", i + 65);
		}
		System.out.printf("\n");
		for (int i = 0; i < nFila; i++) {
			System.out.printf("%02d - ", i + 1);
			for (int j = 0; j < nAssentos; j++) {
				
				if(assentos[i][j].getEstado()) {
					System.out.printf("L ");
				}
				else {
					System.out.printf("X ");
				}
			}
			System.out.printf("\n");
		}
	}
}
