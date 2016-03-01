/*Write a class which will show the face of the card*/
import java.util.Scanner;
public class Card
{
    public final String face;
    public final String suit;
    public Card(String Suit,String Face)
    {
        this.face=Face;
        this.suit=Suit;
    }
    public String ToString()
    {
        return (suit+"of"+face);
    }

}