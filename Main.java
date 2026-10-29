package labexp6;

class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculate() {
        System.out.println("Rectangle Area = " + (length * breadth));
        System.out.println("Rectangle Perimeter = " + (2 * (length + breadth)));
    }
}

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate() {
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
        System.out.println("Circle Perimeter = " + (2 * Math.PI * radius));
    }
}

class Square {
    double side;

    Square(double s) {
        side = s;
    }

    void calculate() {
        System.out.println("Square Area = " + (side * side));
        System.out.println("Square Perimeter = " + (4 * side));
    }
}

class Triangle {
    double a, b, c, height;

    Triangle(double x, double y, double z, double h) {
        a = x;
        b = y;
        c = z;
        height = h;
    }

    void calculate() {
        System.out.println("Triangle Area = " + (0.5 * b * height));
        System.out.println("Triangle Perimeter = " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7);
        Square s = new Square(4);
        Triangle t = new Triangle(3, 4, 5, 3);

        r.calculate();
        c.calculate();
        s.calculate();
        t.calculate();
    }
}