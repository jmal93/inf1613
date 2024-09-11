
public class Venda {
	private Produto[] lstProd=new Produto[100];
	private int qtdProd[]=new int[100];
	private int qtdItens=0;
	
	public void setProd(Produto p,int qtd) {
		lstProd[qtdItens] = p;
		qtdProd[qtdItens] = qtd;
		qtdItens++;
		
	}
	public double valorTotal() {
		double total = 0;
		for (int i = 0; i < qtdItens; i++) {
			total += qtdProd[i] * lstProd[i].getPrecoUnit();
		}
		return total;
	}
}
