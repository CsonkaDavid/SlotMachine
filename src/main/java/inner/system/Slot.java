package inner.system;

import java.util.ArrayList;

public interface Slot
{
    ArrayList<WinLine> roll();

    void setBet(int bet);
    void payout();
    void generateNewLayout();
    void generateSymbols();
    void generateMultipliers();
    void generateWinLines();
}
