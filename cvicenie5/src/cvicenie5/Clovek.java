package cvicenie5;

public class Clovek {
	private String meno;
	private int rokNarodenia;
	
	public Clovek(String meno, int rokNarodenia) {
		super();
		this.meno = meno;
		this.rokNarodenia = rokNarodenia;
	}
	
	public void vypisInformacie(Clovek c) {
		System.out.printf("%s %d\n", c.meno, c.rokNarodenia);
	}
}
