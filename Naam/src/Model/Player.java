package Model;

import java.awt.*;
import java.util.List;

public class Player {
    public String name;
    public int pos_x;
    public int pos_y;
    public int HP;
    public List<Item> inventory;
    public int range;
    public int level;
    public Image sprite;
    public Player(String name, int pos_x, int pos_y, int HP, List<Item> items, int range, int level, Image sprite) {
        setPos_x(pos_x);
        setPos_y(pos_y);
        setName(name);
        setHP(HP);
        setInventory(items);
        setRange(range);
        setLevel(level);
    }


    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        if( inventory.size() <= 7) {
            this.inventory = inventory;
        }
        else {
            throw new RuntimeException("Items size exceeds 7");
        }
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


    public void addItem(Item item) {
        if( inventory.size()<=7) {
            this.inventory.add(item);
        };
    }


}
