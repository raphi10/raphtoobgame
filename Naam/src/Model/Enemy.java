package Model;

import java.util.List;

public class Enemy {
    public String name;
    public int level;
    public int range;
    public int dps;
    public int hp;
    public int pos_x;
    public int pos_y;
    public List<Item> loot;

    //getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public void addLootItem(Item item) {
        loot.add(item);
    }

    public List<Item> getLoot() {
        return loot;
    }

    public void setLoot(List<Item> loot) {
        this.loot = loot;
    }

    //Constructor

    public Enemy(String name, int level, int range, int dps, int hp, int pos_x, int pos_y, List<Item> loot) {
        setName(name);
        setLevel(level);
        setRange(range);
        setDps(dps);
        setHp(hp);
        setPos_x(pos_x);
        setPos_y(pos_y);
        setLoot(loot);
    }
}
