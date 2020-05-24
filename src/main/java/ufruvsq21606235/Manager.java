package ufruvsq21606235;

public class Manager extends Employes {
	
	private int nbEmploye;
	
	public Manager(int nbY, int nb) {
		super(nbY);
		this.nbEmploye = nb;
		
	}

	
	
	@Override
	public double calculsalaire()
	{
		return super.calculsalaire() + nbEmploye * 100;
	}

}
