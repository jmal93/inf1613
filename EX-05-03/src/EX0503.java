
public class EX0503 {

	public static void main(String[] args) {
		Contribuinte []lst;
		
		lst = Contribuinte.listaContr();
		
		System.out.printf("NOME IMPOSTO\n");
		System.out.printf("==================== =======\n\n");
		
		for (int i = 0; i < lst.length; i++) {
			System.out.println(lst[i].nome + " " + lst[i].calcImposto());
		}
	}

}
