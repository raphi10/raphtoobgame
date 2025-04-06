public class Item {
    public String name;
    public int ammount;
    public int cost;
    //getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {return ammount;}
    public void setAmmount(int ammount) {if (ammount <= 64) {this.ammount = ammount;}}

    //constructor
    public Item(String name,int ammount) {
        setName(name);
        setAmmount(ammount);

    }
}
