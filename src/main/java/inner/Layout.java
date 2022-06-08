package inner;

public class Layout
{
    private Symbol[][] symbols;

    Layout(int c, int r) {
        symbols = new Symbol[c][r];
    }

    public Symbol[][] getSymbols() { return symbols; }
    public void setSymbols(Symbol[][] symbols) { this.symbols = symbols; }

    public Symbol getSymbol(Position position)
    {
        int c = position.getColumn();
        int r = position.getRow();

        return symbols[c][r];
    }
}
