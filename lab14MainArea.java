import Area.Rectangle;
import Area.Circle;
import Area.Square;

public class lab14MainArea {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();

        r.area(10, 5);
        c.area(7);
        s.area(4);
    }
}
