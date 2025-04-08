import java.util.List;

public class Item {
    public String name;
    public int ammount;
    public List<Item> cost;
    public int level;
    //getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {return ammount;}
    public void setAmmount(int ammount) {if (ammount <= 64) {this.ammount = ammount;}}

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //constructor
    public Item(String name,int ammount) {
        setName(name);
        setAmmount(ammount);
        setCost(cost);
        setLevel(level);

    }
}