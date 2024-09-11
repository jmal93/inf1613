
public class Main {

	public static void main(String[] args) {
		Xpto x1, x2, x3;
		
		System.out.printf("Quantidade: %d\n", Xpto.getQtdInst());
		x1 = new Xpto();
		System.out.printf("Quantidade: %d\n", Xpto.getQtdInst());
		x2 = new Xpto();
		System.out.printf("Quantidade: %d\n", Xpto.getQtdInst());
		x3 = new Xpto();
		System.out.printf("Quantidade: %d\n", Xpto.getQtdInst());

	}

}
