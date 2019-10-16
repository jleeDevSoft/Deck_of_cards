package CARD;

public class Card 
{
	private int cardValue;
	private String cardFace;
	
	public Card(int value, String face)
	{
		this.cardValue = value;
		this.cardFace = face;
	}
	public int getCardValue()
	{
		return this.cardValue;
	}
	public String getCardFace()
	{
		return this.cardFace;
	}
	public void printCard()
	{
		int valueInt = this.cardValue;
		String valueStr;
		switch(this.cardValue)
		{
			case 11:
				valueStr = "Jack";
				break;
			case 12:
				valueStr = "Queen";
				break;
			case 13:
				valueStr = "King";
				break;
			case 14:
				valueStr = "Ace";
				break;
			default:
				valueStr = String.valueOf(valueInt);
				break;
		}
		System.out.println(valueStr+" of "+this.cardFace);
	}
	
}// end of class Card
