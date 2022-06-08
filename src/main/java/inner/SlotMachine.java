package inner;

import java.util.ArrayList;

public abstract class SlotMachine
{
    int columns, rows, bet, payout;

    Player currentPlayer;

    Layout layout;
    Layout newLayout;
    WinLine[] winLines;
    Symbol[] symbols;

    public ArrayList<WinLine> roll() {
        layout = newLayout;
        ArrayList<WinLine> lines = new ArrayList<>();
        int wins = 0;

        for(var line : winLines) {
            Symbol winningSymbol = layout.getSymbol(line.getStartingPosition());

            int matching = line.checkSymbols(winningSymbol, layout);

            if(matching >= winningSymbol.getWinQuantity())
            {
                wins++;
                payout += winningSymbol.getMultiplier(matching) * bet;
            }

            lines.add(line);
        }

        if(wins == 0)
            return null;
        else
            return lines;
    }

    public void payout() {
        currentPlayer.setMoney(currentPlayer.getMoney() + payout);
        payout = 0;
    }

    public void setBet(int newBet) { bet = newBet; }

    abstract public void generateNewLayout();
}
