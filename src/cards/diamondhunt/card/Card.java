package cards.diamondhunt.card;

import java.util.Random;

public class Card
{
	
	private String name;
	protected Rarity rarity;
	private Random seed;
	private boolean isHolographic;
	
	public Card(String name, Rarity rarity) 
	{
		this.name = name;
		this.rarity = rarity;
		this.seed = new Random();
	}
	
	public void setHolographic(boolean b)
	{
		this.isHolographic = b;
	}
	/**
	 * 
	 * @return random decimal value between 0.0 - 1.0
	 */
	public double random()
	{
		return this.seed.nextDouble();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		return "Card: " + this.name + " Holographic: " + this.isHolographic;
	}
	
	public Rarity getRarity()
	{
		return this.rarity;
		
	}
}
