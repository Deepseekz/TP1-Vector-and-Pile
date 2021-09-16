public class Card
{
    private int _suit;
    private int _rank;

    public Card(int suit, int rank)
    {
        this._suit = suit;
        this._rank = rank;
    }

    private enum CardsColor {
        CLUB(0,"Clubs"),
        DIAMOND(1,"Diamonds"),
        HEART(2,"Hearts"),
        SPADE(3,"Spades");

        private int _value;
        private String _color;

        private CardsColor(int value, String color) {
            _value = value;
            _color = color;
        }
    }

    private enum CardsRank {
        TWO(0,"2"),
        THREE(1,"3"),
        FOUR(2,"4"),
        FIVE(3,"5"),
        SIX(4,"6"),
        SEVEN(5,"7"),
        EIGHT(6,"8"),
        NINE(7,"9"),
        TEN(8,"10"),
        JACK(9,"Jack"),
        QUEEN(10,"Queen"),
        KING(11,"King"),
        AS(12,"As"),
        JOKER(13,"Joker");

        private int _value;
        private String _rank;

        private CardsRank(int value, String rank) {
            _value = value;
            _rank = rank;
        }
    }

    public String toString()
    {
        return CardsRank.values()[_rank] + " of " + CardsColor.values()[_suit];
    }
}
