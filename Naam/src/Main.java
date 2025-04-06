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
        Item Logs_5 = new Item("Logs_5",5);
        Item Stones_5 = new Item("Stones_5",5);
        List<Item> costs_1 = new ArrayList<>();
        Building Archer_tower = new Building("Archer_tower",20,2,7, costs_1,1);
        Archer_tower.addCostItem(Logs_5);
        Archer_tower.addCostItem(Stones_5);

        Item Logs_10 = new Item("Logs_10",10);
        Item Stones_2 = new Item("Stones_2",2);
        List<Item> costs_2 = new ArrayList<>();
        Building Wall = new Building("Wall",50,0,0, costs_2,1);
        Wall.addCostItem(Logs_10);
        Wall.addCostItem(Stones_2);

        Item Stones_10 = new Item("Stones_10",10);
        List<Item> costs_3 = new ArrayList<>();
        Building Canon = new Building("Canon",30,10,5, costs_3,1);
        Canon.addCostItem(Logs_5);
        Canon.addCostItem(Stones_10);

        Item Logs = new Item("Logs",1);
        Item Stones = new Item("Stones",1);
        List<Item> costs_4 = new ArrayList<>();
        Building Mine = new Building("Mine",20,-1,100, costs_4,1);
        Mine.addCostItem(Logs);
        Mine.addCostItem(Stones);
        Mine.addCostItem(Shovel);

        List<Item> costs_1 = new ArrayList<>();
        Building Gate = new Building("Gate",50,0,0, cost_5 );
        Archer_tower.addCostItem(Logs_10);
        Archer_tower.addCostItem(Stones_5);

        Item Logs = new Item("Logs",1);
        Item Stones = new Item("Stones",1);
        List<Item> costs_1 = new ArrayList<>();
        Building Toolsmith = new Building("Toolsmith",60,0,0,costs_6,1);
        Archer_tower.addCostItem(Logs);
        Archer_tower.addCostItem(Stones);

        Item Logs = new Item("Logs",1);
        Item Stones = new Item("Stones",1);
        List<Item> costs_1 = new ArrayList<>();
        Building Shop = new Building("Shop",20,0,0,costs_7,1);
        Archer_tower.addCostItem(Logs);
        Archer_tower.addCostItem(Stones);


    //Player
        Player Rik = new Player("Rik",100,100,10, new ArrayList<>(),2,1);
    //Actions
    Rik.addItem(Log);
    //Check
    for(Item i : Rik.getList()) {
        System.out.println(i.getName());
    }

    }
}