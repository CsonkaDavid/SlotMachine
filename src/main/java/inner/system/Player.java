package inner.system;

public class Player
{
    private final String name;
    private int money;

    Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() { return money; }

    public void setMoney(int money) { this.money = money; }

    public String getName() { return name; }
}
