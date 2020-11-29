package cards.diamondhunt.card;

public class UncommonCard extends Card
{
	private final double HOLOGRAPHIC_PERCENTAGE_CHANCE = 0.10;
	
	
	public UncommonCard(String name, Rarity rarity) 
	{
		super(name, rarity);
		
		boolean isHolographic = (super.random() <= HOLOGRAPHIC_PERCENTAGE_CHANCE) ? true : false;
		super.setHolographic(isHolographic);
	}
}
