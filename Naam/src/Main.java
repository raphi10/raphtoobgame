import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.*;
import java.awt.*;

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
    Item Coin = new Item("Coin",1);
    Item Bone = new Item("Bone",1);
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

        List<Item> costs_5 = new ArrayList<>();
        Building Gate = new Building("Gate",50,0,0, costs_5,1);
        Archer_tower.addCostItem(Logs_10);
        Archer_tower.addCostItem(Stones_5);

        Item Logs_2 = new Item("Logs_2",2);
        List<Item> costs_6 = new ArrayList<>();
        Building Toolsmith = new Building("Toolsmith",60,0,0,costs_6,1);
        Archer_tower.addCostItem(Logs_2);
        Archer_tower.addCostItem(Stones_2);
        Archer_tower.addCostItem(Axe);

        Item Bones_2 = new Item("Bones_2",2);
        List<Item> costs_7 = new ArrayList<>();
        Building Shop = new Building("Shop",20,0,0,costs_7,1);
        Archer_tower.addCostItem(Logs_5);
        Archer_tower.addCostItem(Stones_5);
        Archer_tower.addCostItem(Bones_2);



    //Player
        Player Rik = new Player("Rik",100,100,10, new ArrayList<>(),2,1);

    //Enemys
    List<Item> loot_1 = new ArrayList<>();
    Enemy Swordsman = new Enemy("Swordsman",1,2,4,15,1,1,loot_1);
    Swordsman.addLootItem(Bones_2);
    Swordsman.addLootItem(Sword);
    Swordsman.addLootItem(Coin);

    List<Item> loot_2 = new ArrayList<>();
    Enemy Archer = new Enemy("Archer",1,10,2,10,1,1,loot_2);
    Archer.addLootItem(Bow);
    Archer.addLootItem(Logs_2);

    Item Coins_2 = new Item("Coins_2",2);
    List<Item> loot_3 = new ArrayList<>();
    Enemy Healer = new Enemy("Healer",1,5,-1,5,1,1,loot_3);
    Healer.addLootItem(Coins_2);

    List<Item> loot_4 = new ArrayList<>();
    Enemy Schieldman = new Enemy("Schieldman",1,0,0,30,1,1,loot_4);
    Schieldman.addLootItem(Logs_2);
    Schieldman.addLootItem(Stones_2);

    List<Item> loot_5 = new ArrayList<>();
    Enemy Axeman = new Enemy("Axeman",1,1,9,20,1,1,loot_5);
    Axeman.addLootItem(Log);
    Axeman.addLootItem(Axe);

    //JPanel
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //vertikaal scherm

        panel.add(new JLabel("Items:"));
        panel.add(new JLabel(Log.getName()));
        panel.add(new JLabel(Stone.getName()));
        panel.add(new JLabel(Sword.getName()));
        panel.add(new JLabel(Axe.getName()));
        panel.add(new JLabel(Bow.getName()));
        panel.add(new JLabel(Shovel.getName()));
        panel.add(new JLabel(Ground.getName()));
        panel.add(new JLabel(Sand.getName()));
        panel.add(new JLabel(Coin.getName()));
        panel.add(new JLabel(Bone.getName()));

        panel.add(new JLabel("Buildings:"));
        panel.add(new JLabel(Archer_tower.getName() + " - Costs: " + Archer_tower.getCost()));

        // Add Player details
        panel.add(new JLabel("Player: " + Rik.getName() + " - Health: " + Rik.getHP()));

        // Add Enemy details
        panel.add(new JLabel("Enemies:"));
        panel.add(new JLabel(Swordsman.getName() + " - Loot: " + Swordsman.getLoot()));

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Display the JFrame
        frame.setVisible(true);
    //Check
    for(Item i : Rik.getList()) {
        System.out.println(i.getName());
    }


    }
}