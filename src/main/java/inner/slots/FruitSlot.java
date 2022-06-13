package inner.slots;

import inner.system.*;

public class FruitSlot extends SlotMachine
{
    private double[] cherryMultipliers;
    private double[] orangeMultipliers;
    private double[] lemonMultipliers;
    private double[] pruneMultipliers;
    private double[] melonMultipliers;
    private double[] sevenMultipliers;

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
        Symbol cherry = new Symbol(11, 2, cherryMultipliers, SymbolType.Simple, null);
        Symbol orange = new Symbol(12, 3, orangeMultipliers, SymbolType.Simple, null);
        Symbol lemon = new Symbol(13, 3, lemonMultipliers, SymbolType.Simple, null);
        Symbol prune = new Symbol(14, 3, pruneMultipliers, SymbolType.Simple, null);
        Symbol melon = new Symbol(15, 3, melonMultipliers, SymbolType.Simple,null);
        Symbol seven = new Symbol(16, 2, sevenMultipliers, SymbolType.Simple,null);

        symbols[0] = cherry;
        symbols[1] = orange;
        symbols[2] = lemon;
        symbols[3] = prune;
        symbols[4] = melon;
        symbols[5] = seven;
    }

    @Override
    public void generateMultipliers() {
        cherryMultipliers = super.multipliers(0.0,0.5, 1.0, 5.0, 10.0);
        orangeMultipliers = super.multipliers(0.0,0.0, 1.0, 6.0, 12.0);
        lemonMultipliers = super.multipliers(0.0,0.5, 1.5, 6.0, 12.0);
        pruneMultipliers = super.multipliers(0.0,0.5, 1.5, 6.0, 12.0);
        melonMultipliers = super.multipliers(0.0,0.0, 2.0, 10.0, 20.0);
        sevenMultipliers = super.multipliers(0.0, 2.0, 5.0, 15.0, 30.0);
    }

    @Override
    public void generateWinLines() {
        Position[] positions1 = new Position[columns];
        Position[] positions2 = new Position[columns];
        Position[] positions3 = new Position[columns];
        Position[] positions4 = new Position[columns];
        Position[] positions5 = new Position[columns];



        WinLine winLine1 = new WinLine();
    }
}
