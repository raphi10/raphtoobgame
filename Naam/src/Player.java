import java.util.List;

public class Player {
    public String name;
    public int pos_x;
    public int pos_y;
    public int HP;
    public List<Item> list;
    public int range;
    public Player(String name, int pos_x, int pos_y, int HP, List<Item> items, int range) {
        setPos_x(pos_x);
        setPos_y(pos_y);
        setName(name);
        setHP(HP);
        setList(items);
        setRange(range);
    }

    public String getName() {return name;
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

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        if( list.size() <= 7) {
            this.list = list;
        }
        else {
            throw new RuntimeException("Items size exceeds 7");
        }
    }
    public void addItem(Item item) {
        if( list.size()<=7) {
            this.list.add(item);
        };
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
