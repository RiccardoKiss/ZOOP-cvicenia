package cvicenie5;

public class Obyvatel {
	private String meno;
	private int vyska, vaha;
	
	Obyvatel(String meno, int vyska, int vaha) {
		this.meno = meno;
		this.vyska = vyska;
		this.vaha = vaha;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public int getVyska() {
		return vyska;
	}

	public void setVyska(int vyska) {
		this.vyska = vyska;
	}

	public int getVaha() {
		return vaha;
	}

	public void setVaha(int vaha) {
		this.vaha = vaha;
	}
}
