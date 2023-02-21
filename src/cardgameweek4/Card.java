package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 * 
 */

public class Card {
        
 
    
        public enum Suit {RED, YELLOW,GREEN,BLUE};
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR};
        private final Suit suit;
        private final Value value;
        /*high cohesion and loose coupling are the OOPs principle that make reuse reuse your original Card code and extend it to become an Uno deck 
        This means that each class is independent and changes in one class doesn't effect another class
*/
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}