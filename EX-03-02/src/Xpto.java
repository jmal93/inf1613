
public class Xpto {
	private static int constInst = 0;
	
	public Xpto() {
		constInst += 1;
	}
	
	public static int getQtdInst() {
		return constInst;
	}
}
