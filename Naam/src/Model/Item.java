package Model;

public class Item {
    public String name;
    public int ammount;
    public int level;
    //getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {
        return ammount;
    }
    public void setAmmount(int ammount) {
        if (ammount <= 64) {this.ammount = ammount;}
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
        setLevel(level);

    }
}