package cards.diamondhunt.card;

public class VeryRareCard extends Card
{
	private final double HOLOGRAPHIC_PERCENTAGE_CHANCE = 0.50;
	
	
	public VeryRareCard(String name, Rarity rarity) 
	{
		super(name, rarity);
		
		boolean isHolographic = (super.random() <= HOLOGRAPHIC_PERCENTAGE_CHANCE) ? true : false;
		super.setHolographic(isHolographic);
	}
	
	
}
