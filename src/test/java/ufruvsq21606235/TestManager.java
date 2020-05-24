package ufruvsq21606235;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestManager {

	@Test
	public void testConstruction() {
		Manager m = new Manager(3, 10);
		assertNotNull(m);
	}
	
	@Test
	public void testCalculSalaireManager() {
		Manager m = new Manager(3, 10);
		assertTrue(m.calculsalaire() == (1500 + 3*20 + 10*100));
		System.out.println("Calcul salaire Manager correcte");

	}

}
