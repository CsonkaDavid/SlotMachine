package inner.system;

public class WinLine
{
    private final Position[] positions;
    private final int size;

    WinLine(Position[] winPositions) {
        positions = winPositions;
        size = winPositions.length;
    }

    public int countMatches(Symbol symbol, Layout layout) {
        int matching = 0;

        for(int i = 0; i < size; i++) {
            Position pos = positions[i];

            if(layout.getSymbol(pos) == symbol)
                matching++;
            else break;
        }

        return matching;
    }

    public Position getStartingPosition() { return positions[0]; }
}

