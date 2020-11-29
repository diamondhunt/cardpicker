package cards.diamondhunt.card.picker;

import java.util.ArrayList;

import cards.diamondhunt.card.Card;
import cards.diamondhunt.card.CommonCard;
import cards.diamondhunt.card.LegendaryCard;
import cards.diamondhunt.card.RareCard;
import cards.diamondhunt.card.UncommonCard;
import cards.diamondhunt.card.VeryRareCard;
import cards.diamondhunt.database.DatabaseFactory;

/**
 * Singleton
 * 
 * @author Smitty
 */
public class CardPickerFactory 
{
	private static CardPickerFactory cardPickerFactory = null;
	
	
	private ArrayList<Card> commonCards;
	private ArrayList<Card> uncommonCards;
	private ArrayList<Card> rareCards;
	private ArrayList<Card> veryRareCards;
	private ArrayList<Card> legendaryCards;
	
	private CardPickerFactory()
	{
		ArrayList<Card> allCards = DatabaseFactory.getInstance().getAllCards();
		this.commonCards = new ArrayList<Card>();
		this.uncommonCards = new ArrayList<Card>();
		this.rareCards = new ArrayList<Card>();
		this.veryRareCards = new ArrayList<Card>();
		this.legendaryCards = new ArrayList<Card>();
		
		
		for(Card card : allCards)
		{
			switch(card.getRarity())
			{
				case COMMON:
					this.commonCards.add(new CommonCard(card.getName(), card.getRarity()));
				break;
				case UNCOMMON:
					this.uncommonCards.add(new UncommonCard(card.getName(), card.getRarity()));
				break;
				case RARE:
					this.rareCards.add(new RareCard(card.getName(), card.getRarity()));
				break;
				case VERY_RARE:
					this.veryRareCards.add(new VeryRareCard(card.getName(), card.getRarity()));
				break;
				case LEGENDARY:
					this.legendaryCards.add(new LegendaryCard(card.getName(), card.getRarity()));
				break;
			}
		}
	}
	
	public static CardPickerFactory getInstance()
	{
		if(cardPickerFactory == null)
		{
			cardPickerFactory = new CardPickerFactory();
		}
		
		return cardPickerFactory;
	}
	
}
