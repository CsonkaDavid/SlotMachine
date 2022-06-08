package inner;

public class FruitSlot extends SlotMachine
{
    FruitSlot() {
        columns = 5;
        rows = 4;

        generateSymbols();
        generateNewLayout();
    }

    @Override
    public void generateNewLayout()
    {
        for(int c = 0; c < columns; c++) {
            for(int r = 0; r < rows; r++) {

            }
        }
    }

    @Override
    public void generateSymbols()
    {
        Symbol cherry = new Symbol(11, 2, multipliers(0.0,0.5, 1.0, 5.0, 10.0), null);
        Symbol orange = new Symbol(12, 3, multipliers(0.0,0.5, 1.0, 5.0, 10.0), null);
        Symbol lemon = new Symbol(13, 3, multipliers(0.0,0.5, 1.0, 5.0, 10.0), null);
        Symbol prune = new Symbol(14, 3, multipliers(0.0,0.5, 1.0, 5.0, 10.0), null);
        Symbol melon = new Symbol(15, 3, multipliers(0.0,0.5, 1.0, 5.0, 10.0), null);
    }
}
