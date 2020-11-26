package cards.diamondhunt.main;

import cards.diamondhunt.card.CommonCard;
import cards.diamondhunt.card.Rarity;

public class Main 
{
	public static void main(String[]args)
	{
		CommonCard commonCard = new CommonCard("copper", Rarity.COMMON);
		System.out.println(commonCard.random());
	}
}
