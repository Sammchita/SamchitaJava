class Box {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double getVolume() {
        return length * breadth * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        weight = w;
    }

    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        BoxWeight box1 = new BoxWeight(2, 3, 4, 5);
        BoxWeight box2 = new BoxWeight(4, 5, 6, 10);

        System.out.println("Box 1 Volume: " + box1.getVolume());
        box1.displayWeight();

        System.out.println("Box 2 Volume: " + box2.getVolume());
        box2.displayWeight();
    }
}