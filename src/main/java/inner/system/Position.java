package inner.system;

import java.util.Objects;

public class Position
{
    private final int column;
    private final int row;

    Position(int c, int r) {
        column = c;
        row = r;
    }

    public int getColumn() { return column; }
    public int getRow() { return row; }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
            return true;

        if(o == null || getClass() != o.getClass())
            return false;

        Position position = (Position) o;

        return column == position.column && row == position.row;
    }

    @Override
    public int hashCode() { return Objects.hash(column, row); }
}
