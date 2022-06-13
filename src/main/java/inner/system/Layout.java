package inner.system;

public class Layout
{
    Reel[] reels;

    public Layout(int columns, int rows) {
        reels = new Reel[columns];

        for(int i = 0; i < columns; i++)
            reels[i] = new Reel(rows);
    }

    public Symbol getSymbol(Position p) { return reels[p.getColumn()].getSymbols()[p.getRow()]; }
}
