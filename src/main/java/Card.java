public class Card
{
    private final int _suit;
    private final int _rank;

    public Card(int suit, int rank)
    {
        this._suit = suit;
        this._rank = rank;
    }

    private enum CardsColor {
        CLUB("Clubs"),
        DIAMOND("Diamonds"),
        HEART("Hearts"),
        SPADE("Spades");

        private final String _color;

        CardsColor(String color) {
            _color = color;
        }
    }

    private enum CardsRank {
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King"),
        AS("As"),
        JOKER("Joker");

        private final String _rank;

        CardsRank(String rank) {
            _rank = rank;
        }
    }

    public String toString()
    {
        String result = "";
        result = CardsRank.values()[_rank]._rank;

        if (_rank != 13)
            result += " of " + CardsColor.values()[_suit]._color;
        return result;
    }
}
