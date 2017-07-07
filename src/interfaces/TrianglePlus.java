package interfaces;

import java.awt.*;

/**
 * Created by Bext on 04/01/2017.
 */
public class TrianglePlus implements Relatable {
    public int height = 0;
    public int base = 0;
    public Point origin;

    public TrianglePlus() {
        origin =  new Point(0,0);
    }

    public TrianglePlus(Point origin) { this.origin = origin;}

    public TrianglePlus(int base, int height){
        origin = new Point(0,0);
        this.base = base;
        this.height = height;
    }

    public TrianglePlus(int base, int height, Point origin){
        this.origin = origin;
        this.base = base;
        this.height = height;
    }
    //..more contructors

    public int getArea(){
        return (base * height / 2);
    }

    public int isLargerThan(Relatable other) {
        if (other instanceof TrianglePlus) {
            TrianglePlus  otherTrian = (TrianglePlus) other;
            if (this.getArea() < otherTrian.getArea()){
                return -1;
            } else if (this.getArea() > otherTrian.getArea()){
                return 1;
            } else
                return 0;
        } else if (other instanceof RectanglePlus){
            RectanglePlus otherRect = (RectanglePlus) other;
            if (this.getArea() < otherRect.getArea()) {
                return -1;
            } else if (this.getArea() > otherRect.getArea()) {
                return 1;
            } else
                return 0;
        } else {
            System.err.println("other is of an instance not implemented...");
            return 0;
        }
    }

    public String toString(){
        return "getClass().getName(): " + getClass().getName() + " Area: " + getArea();
    }

}
