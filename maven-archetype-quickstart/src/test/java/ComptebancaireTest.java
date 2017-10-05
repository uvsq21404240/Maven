import static org.junit.Assert.*;

import org.junit.Test;

public class ComptebancaireTest {

	@Test
	public void testcredit() {
		Comptebancaire c1 = new Comptebancaire(20);
		int v = 15;
		c1.credit(v);
		assertEquals(c1.getsolde() , 35);
	}
	@Test
	public void testdebit() {
		Comptebancaire c1 = new Comptebancaire(20);
		int v = 15;
		c1.debit(v);
		assertEquals(c1.getsolde() , 5);
	}
	@Test
	public void testgetsolde() {
		Comptebancaire c1 = new Comptebancaire(20);
		assertEquals(c1.getsolde() , 20);
	}
	@Test
	public void testvirement() {
		Comptebancaire c1 = new Comptebancaire(50);
		Comptebancaire c2 = new Comptebancaire(100);
		int v = 30;
		c1.virement(c2, v);
		assertEquals(c1.getsolde() , 20);
		assertEquals(c2.getsolde() , 130);
	}
	@Test(expected=IllegalArgumentException.class)
	public void valeur_negative()
	{
		Comptebancaire c1 = new Comptebancaire(-50);
	}
}
	

