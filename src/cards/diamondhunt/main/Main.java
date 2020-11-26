package cards.diamondhunt.main;

import cards.diamondhunt.card.Card;
import cards.diamondhunt.card.CommonCard;
import cards.diamondhunt.card.LegendaryCard;
import cards.diamondhunt.card.Rarity;

public class Main 
{
	public static void main(String[]args)
	{
		Card commonCard = new CommonCard("copper", Rarity.COMMON);
		Card legendaryCard = new LegendaryCard("bloodDiamond", Rarity.LEGENDARY);
		System.out.println(legendaryCard.toString());
	}
}
