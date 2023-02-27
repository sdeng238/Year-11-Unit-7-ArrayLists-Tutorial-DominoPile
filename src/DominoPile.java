import java.util.ArrayList;
import java.util.Random;

public class DominoPile
{
    ArrayList<Domino> pile;

    public DominoPile(ArrayList<Domino> pile) {
        this.pile = new ArrayList<>();
    }

    public void newStack6()
    {
        for(int num = 0; num <= 6; num++)
        {
            for(int numTwo = num; numTwo <= 6; numTwo++)
            {
                pile.add(new Domino(num, numTwo));
            }
        }
    }

    public void shuffle()
    {
        Random rand = new Random();
        ArrayList<Domino> shuffledPile = new ArrayList<>();
        int randomInt;

        while(pile.size() > 0)
        {
            randomInt = rand.nextInt(pile.size());
            shuffledPile.add(pile.get(randomInt));
            pile.remove(randomInt);
        }

        pile = shuffledPile;
    }
}
