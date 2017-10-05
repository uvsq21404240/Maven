
public class Comptebancaire {

	private int solde ;
	public Comptebancaire(int s)
	{
		
		if (s>0)
		this.solde = s;
		else throw new IllegalArgumentException();
	}
	
	public int getsolde()
	{
		return this.solde;
	}
	
	
	public void credit(int v)
	{
		this.solde = this.solde + v ;
	}
	public void debit(int v)
	{
		if(this.solde >= v && v>0 )
		{
		this.solde = this.solde - v;
		}
	}
	public void virement(Comptebancaire c , int v)
	{
		if(this.solde >= v && v>0 )
		{
		///c.solde = c.solde + v;
			c.credit(v);
		///this.solde = this.solde - v;
			this.debit(v);
		}
	}
	
}



