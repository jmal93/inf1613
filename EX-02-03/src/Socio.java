
public class Socio {
	private String nome;
	private String endereco;
	private String dtNasc;
	private int matric;

	public Socio(int x) {
		matric = x;
	}
	
	public String getMatric() {
		int mod = matric % 10;
		int mantissa = matric / 10;
		return Integer.toString(mantissa) + "-" + Integer.toString(mod);
	}
}
