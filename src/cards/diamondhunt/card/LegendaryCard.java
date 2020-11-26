package cards.diamondhunt.card;

public class LegendaryCard extends Card
{
	private final double HOLOGRAPHIC_PERCENTAGE_CHANCE = 1.00;
	
	
	public LegendaryCard(String name, Rarity rarity) 
	{
		super(name, rarity);
		
		boolean isHolographic = (super.random() <= HOLOGRAPHIC_PERCENTAGE_CHANCE) ? true : false;
		super.setHolographic(isHolographic);
	}
	
	
}
