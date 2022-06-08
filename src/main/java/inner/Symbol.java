package inner;

import java.util.Objects;

public class Symbol
{
    private final int id;
    private final int winQuantity;
    private final int[] multipliers;

    Symbol(int id, int winQuantity, int[] multipliers) {
        this.id = id;
        this.winQuantity = winQuantity;
        this.multipliers = multipliers;
    }

    public int getWinQuantity() { return winQuantity; }
    public int getId() { return id; }
    public int getMultiplier(int quantity) { return multipliers[quantity-1]; }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
            return true;

        if(o == null || getClass() != o.getClass())
            return false;

        Symbol symbol = (Symbol) o;

        return id == symbol.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
