package ufruvsq21606235;

public class Manager extends Employes {
	
	public Manager(int nbY, int nb) {
		super(nbY);
		this.nbEmploye = nb;
		
	}

	private int nbEmploye;
	
	@Override
	public double calculsalaire()
	{
		return super.calculsalaire() + nbEmploye * 100;
	}

}
