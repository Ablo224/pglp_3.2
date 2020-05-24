package ufruvsq21606235;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployes {
	
	@Before
	public void testConstruction() {
		Employes e = new Employes(2);
		assertNotNull(e);
	}

	@Test
	public void testCalculSalaire() {
		int nbAnnee = 2;
		Employes e = new Employes(nbAnnee);
		assertTrue(e.calculsalaire() == (1500+2*20));
		System.out.println("Calcul salaire employé correcte");
	}

}
