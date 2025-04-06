import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Building {
    public String name;
    public int HP;
    public int dps;
    public int range;
    public List<Item> cost;
    public int level;
    public Building(String name, int HP, int dps, int range, List<Item> cost, int level) {
        setName(name);
        setHP(HP);
        setDps(dps);
        setRange(range);
        setCost(cost);
        setLevel(level);
    }

    public void addCostItem(Item item) {
        cost.add(item);
    }

    public List<Item> getCost() {
        return cost;
    }

    public void setCost(List<Item> cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
