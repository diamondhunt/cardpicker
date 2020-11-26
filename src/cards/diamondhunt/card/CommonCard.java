package cards.diamondhunt.card;

public class CommonCard extends Card
{
	private final double HOLOGRAPHIC_PERCENTAGE_CHANCE = 0.05;
	
	
	public CommonCard(String name, Rarity rarity) 
	{
		super(name, rarity);
		
		boolean isHolographic = (super.random() <= HOLOGRAPHIC_PERCENTAGE_CHANCE) ? true : false;
		super.setHolographic(isHolographic);
	}
	
	
}
