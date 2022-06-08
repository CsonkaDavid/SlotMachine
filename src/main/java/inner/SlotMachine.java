package inner;

import java.util.ArrayList;
import java.util.Random;

public abstract class SlotMachine implements Slot
{
    int id, columns, rows, bet, payout;

    Player currentPlayer;

    Layout layout;
    Layout newLayout;
    WinLine[] winLines;
    Symbol[] symbols;

    public ArrayList<WinLine> roll() {
        layout = newLayout;
        ArrayList<WinLine> lines = new ArrayList<>();

        for(var line : winLines) {
            Symbol winningSymbol = layout.getSymbol(line.getStartingPosition());

            int matching = line.checkSymbols(winningSymbol, layout);

            if(matching >= winningSymbol.getWinQuantity()) {
                payout += winningSymbol.getMultiplier(matching) * bet;

                lines.add(line);
            }
        }

        return lines;
    }

    public boolean chance(double chance) {
        boolean win = false;

        Random rand = new Random();
        rand.nextDouble(0,100);

        return win;
    }

    public double[] multipliers(double one, double two, double three, double four, double five) {
        return new double[]{one, two, three, four, five};
    }

    @Override
    public void payout() {
        currentPlayer.setMoney(currentPlayer.getMoney() + payout);
        payout = 0;
    }

    @Override
    public void setBet(int bet) { this.bet = bet; }
}
