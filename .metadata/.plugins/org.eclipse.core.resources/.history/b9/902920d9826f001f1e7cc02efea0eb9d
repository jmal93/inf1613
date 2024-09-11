package lista;

public class Lista {
	private int tam = 0;
	private No ini = null;
	private No fin = null;
	private No corr = null;
	
	public boolean vazio() {
		return tam == 0;
	}
	
	public void insIni(Object x) {
		No novo_no = new No(x, ini);
		ini = novo_no;
		if (fin == null)
			fin = novo_no;
		tam++;
	}
	
	public void insFin(Object x) {
		No novo_no = new No(x, null);
		if (fin != null)
			fin.setProx(novo_no);
		fin = novo_no;
		if (ini == null)
			ini = novo_no;
		tam++;
	}
	
	public Object retIni() {
		if (vazio())
			return null;
		Object aux = ini.getElem();
		ini = ini.getProx();
		if (ini == null)
			fin = null;
		tam--;
		return aux;
	}
	
	public Object retFin() {
		if (vazio())
			return null;
		Object aux = fin.getElem();
		if (fin == ini)
			ini = fin = null;
		else {
			No atual = ini;
			while (atual.getProx() != fin)
				atual = atual.getProx();
			atual.setProx(null);
			fin = atual;
		}
		tam--;
		return aux;
	}
	
	public void posIni() {
		corr = ini;
	}
	
	public Object prox() {
		if (corr == null)
			return null;
		Object aux = corr.getElem();
		corr = corr.getProx();
		return aux;
	}
}
