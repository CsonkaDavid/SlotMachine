package inner.system;

public class Reel
{
    private Symbol[] symbols;

    public Reel(int size) {
        symbols = new Symbol[size];
    }

    public Symbol[] getSymbols() { return symbols; }

    public void setSymbols(Symbol[] symbols) { this.symbols = symbols; }

    public void setSymbol(int n, Symbol s) { symbols[n] = s; }
}
