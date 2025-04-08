package Model;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Tile {
    public String name;
    public int x_pos;
    public int y_pos;

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

    public Tile(String name, int x_pos, int y_pos) {
        setName(name);
        setX_pos(x_pos);
        setY_pos(y_pos);
    }
}
