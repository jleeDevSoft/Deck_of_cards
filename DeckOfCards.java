package CARD;

import java.util.Random;

public class DeckOfCards 
{
	final private int cardValues[] = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	final private String cardFaces[] = {"Spades","Clubs","Diamonds","Hearts"};
	final private int numOfCardsInDeck = 52;
	
	private Card[] deckOfCards = new Card[numOfCardsInDeck];
	
	public DeckOfCards()
	{
		//deckOfCards = new Card[52];
		int deckIndex = 0;
		
		for(int x=0; x< cardValues.length; x++)
		{
			for(int y=0; y < cardFaces.length; y++)
			{
				deckOfCards[deckIndex] = new Card(cardValues[x], cardFaces[y]); 
				deckIndex++;
			}
		}
	}//----------------------------
	public void shuffleDeck()
	{
		Random rand = new Random(); 
		int randomNum;
		Card tempCard;
		
		for(int i=0; i< numOfCardsInDeck; i++)
		{
			randomNum = rand.nextInt(numOfCardsInDeck);// produces random number between 0 and 51
			tempCard = deckOfCards[i]; // places current card into tempCard
			deckOfCards[i] = deckOfCards[randomNum]; // places randomCard into current position
			deckOfCards[randomNum] = tempCard;	// places current card into random position
		}
		
	}// shuffleDeck
	public void printDeckOfCards()
	{
		for(int i=0; i<deckOfCards.length; i++)
		{
			deckOfCards[i].printCard();
		}
	}// printDeckOfCards
}//------------------------------------
