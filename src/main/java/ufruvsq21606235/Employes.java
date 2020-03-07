package ufruvsq21606235;

public class Employes implements Salaire{
	
	private int nbY;
	
	public Employes(int nbY)
	{
		this.nbY = nbY;
	}
	
	@Override
	public double calculsalaire() {
		// TODO Auto-generated method stub
		return 1500 + nbY*20;
	}

	
	
}
