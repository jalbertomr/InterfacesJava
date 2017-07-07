package interfaces;

import java.awt.*;

/**
 * Created by Bext on 04/01/2017.
 */
public class RectanglePlus implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    //four constructors
    public RectanglePlus() {
        origin = new Point(0,0);
    }

    public RectanglePlus(Point origin) {
        this.origin = origin;
    }

    public RectanglePlus(int width, int height) {
        origin = new Point(0,0);
        this.width = width;
        this.height = height;
    }

    public RectanglePlus(int width, int height, Point origin) {
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    //method for moving the rectangle
    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int getArea(){
        return width * height;
    }

    public int isLargerThan(Relatable other){
        //other.getArea will fail
        //other is Cast to RectanglePlus to use getArea
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

    public Object findLarger(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if (obj1.isLargerThan(obj2) > 0)
            return object1;
        else
            return object2;
    }

    public Object findSmaller(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if (obj1.isLargerThan(obj2) < 0)
            return object1;
        else
            return object2;
    }

    public Object isEqual(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if (obj1.isLargerThan(obj2) == 0)
            return true;
        else
            return false;
    }

    public String toString(){
        return "getClass().getName(): " + getClass().getName() + " Area: " + getArea();
    }
}
