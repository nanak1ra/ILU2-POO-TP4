package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String nom, Unite unite, String datePeche) {
		super("Poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public void decrireProduit() {
		System.out.println(this + " pêchés " + this.datePeche);
	}

}
