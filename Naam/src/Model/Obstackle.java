package Model;

public class Obstackle {
    public String name;
    public int x_pos;
    public int y_pos;
    public int HP;

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX_pos() {
        return x_pos;
    }

    public void setX_pos(int x_pos) {
        this.x_pos = x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public void setY_pos(int y_pos) {
        this.y_pos = y_pos;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Obstackle(String name, int x_pos, int y_pos, int HP) {
        setName(name);
        setX_pos(x_pos);
        setY_pos(y_pos);
        setHP(HP);
    }
}
