package cards.diamondhunt.card.picker;

import java.util.ArrayList;

import cards.diamondhunt.card.Card;
import cards.diamondhunt.card.Rarity;

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
		this.commonCards = new ArrayList<Card>();
		this.uncommonCards = new ArrayList<Card>();
		this.rareCards = new ArrayList<Card>();
		this.veryRareCards = new ArrayList<Card>();
		this.legendaryCards = new ArrayList<Card>();
		
		//common cards
		this.commonCards.add(new Card("stone", Rarity.COMMON));
		this.commonCards.add(new Card("copper", Rarity.COMMON));
		this.commonCards.add(new Card("iron", Rarity.COMMON));
		this.commonCards.add(new Card("silver", Rarity.COMMON));
		
		this.commonCards.add(new Card("miner", Rarity.COMMON));
		this.commonCards.add(new Card("drills", Rarity.COMMON));
		this.commonCards.add(new Card("crushers", Rarity.COMMON));
		
		this.commonCards.add(new Card("bronzeBar", Rarity.COMMON));
		this.commonCards.add(new Card("ironBar", Rarity.COMMON));
		this.commonCards.add(new Card("silverBar", Rarity.COMMON));
		
		this.commonCards.add(new Card("vialOfWater", Rarity.COMMON));
		
		this.commonCards.add(new Card("chicken", Rarity.COMMON));
		this.commonCards.add(new Card("rat", Rarity.COMMON));
		this.commonCards.add(new Card("bee", Rarity.COMMON));
		this.commonCards.add(new Card("rawChicken", Rarity.COMMON));
		this.commonCards.add(new Card("stinger", Rarity.COMMON));
		this.commonCards.add(new Card("cheese", Rarity.COMMON));
		
		this.commonCards.add(new Card("snake", Rarity.COMMON));
		this.commonCards.add(new Card("ent", Rarity.COMMON));
		this.commonCards.add(new Card("thief", Rarity.COMMON));
		this.commonCards.add(new Card("snakeskin", Rarity.COMMON));
		this.commonCards.add(new Card("ironDagger", Rarity.COMMON));
		
		this.commonCards.add(new Card("bear", Rarity.COMMON));
		this.commonCards.add(new Card("spider", Rarity.COMMON));
		this.commonCards.add(new Card("skeleton", Rarity.COMMON));
		this.commonCards.add(new Card("skeletonSword", Rarity.COMMON));
		this.commonCards.add(new Card("skeletonShield", Rarity.COMMON));
		this.commonCards.add(new Card("boneAmulet", Rarity.COMMON));
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
