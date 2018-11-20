
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Player implements Serializable {

    private String name;
    private int attack;
    private int defense;
    private int hp;
    private ArrayList<Item> items = new ArrayList<>();

    public Player(String name, int attack, int defense, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
    }

    public void fight(Player one, Player two) {
        
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void remItem(int idx) {
        items.remove(idx);
    }
}
