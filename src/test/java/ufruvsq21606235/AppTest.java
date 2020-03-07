package ufruvsq21606235;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	Vendeur v = new Vendeur(2,100) ;
		Vendeur v2 = new Vendeur(0,200) ;
		Employes e1 = new Employes(0);
		Manager m = new Manager(0,3);
		ArrayList<Employes> listEmploye = new ArrayList <Employes>() ;
		listEmploye.add(v);
		listEmploye.add(v2);
		listEmploye.add(e1);
		listEmploye.add(m);
		double totalSalaire = 0 ;
		for (int i = 0; i < listEmploye.size(); i++) {
			totalSalaire += listEmploye.get(i).calculsalaire();
		}
		
		System.out.println(" salaire total : "  +totalSalaire);
    }
}
