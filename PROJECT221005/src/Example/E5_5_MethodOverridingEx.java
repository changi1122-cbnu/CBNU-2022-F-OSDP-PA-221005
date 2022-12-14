package Example;// 예제 5-5

class Shape {
    public Shape next;
    public Shape() { next = null; }

    public void draw() {
        System.out.println("Example.Shape");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Example.Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Example.Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Example.Circle");
    }
}

public class E5_5_MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
