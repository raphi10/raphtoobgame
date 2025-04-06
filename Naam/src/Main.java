import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //Items
    Item Log = new Item("Log",1);
    Item Stone = new Item("Stone",1);
    Item Sword = new Item("Sword",1);
    Item Axe = new Item("Axe",1);
    Item Bow = new Item("Bow",1);
    Item Shovel = new Item("Shovel",1);
    Item Ground = new Item("Ground",1);
    Item Sand = new Item("Sand",1);
    // Buildings
        Item Logs = new Item("Logs",5);
        Item Stones = new Item("Stones",5);
        List<Item> costs = new ArrayList<>();
        Building Archer_tower = new Building("Archer_tower",1,50,2,5, costs);
        Archer_tower.addCostItem(Logs);
    //Player
        Player Rik = new Player("Rik",100,100,10, new ArrayList<>(),2);
    //Actions
    Rik.addItem(Log);
    //Check
    for(Item i : Rik.getList()) {
        System.out.println(i.getName());
    }

    }
}