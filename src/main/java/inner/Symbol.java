package inner;

import java.io.File;
import java.util.Objects;

public class Symbol
{
    private final int id;
    private final int winQuantity;
    private final double[] multipliers;
    private final File image;

    Symbol(int id, int winQuantity, double[] multipliers, String path) {
        this.id = id;
        this.winQuantity = winQuantity;
        this.multipliers = multipliers;
        image = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(path)).getFile());
    }

    public int getWinQuantity() { return winQuantity; }
    public int getId() { return id; }
    public double getMultiplier(int quantity) { return multipliers[quantity-1]; }

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

    public File getImage() { return image; }
}
