package ufruvsq21606235;

public class Vendeur extends Employes{
	private int commission;

	public Vendeur(int nbY,int c) {
		super(nbY);
		this.commission = c;
	}

	@Override
	public double calculsalaire()
	{
		return super.calculsalaire() + commission;
	}

}
