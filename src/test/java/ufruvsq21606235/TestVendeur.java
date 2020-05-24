package ufruvsq21606235;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVendeur {

	@Test
	public void test() {
		Vendeur v = new Vendeur(2, 200);
		assertNotNull(v);
	}
	
	
	@Test
	public void testcalculsaaireVendeur() {
		Vendeur v = new Vendeur(2, 100);
		assertTrue(v.calculsalaire() == (1500+2*20+100));
		System.out.println("Calcul salaire vendeurs correcte");

	}
}
