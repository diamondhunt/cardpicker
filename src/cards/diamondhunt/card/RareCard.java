package cards.diamondhunt.card;

public class RareCard extends Card
{
	private final double HOLOGRAPHIC_PERCENTAGE_CHANCE = 0.25;
	
	
	public RareCard(String name, Rarity rarity) 
	{
		super(name, rarity);
		
		boolean isHolographic = (super.random() <= HOLOGRAPHIC_PERCENTAGE_CHANCE) ? true : false;
		super.setHolographic(isHolographic);
	}
	
	
}
