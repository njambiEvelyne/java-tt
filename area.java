interface Shape {
    double area();
    double perimeter();
}

class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
class Rectangle implements Shape{
    double a, b, c, d;
    Rectangle(double a, double b, double c ,double d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    }
    public double area (){
        return a*b;
    }
    public double perimeter(){
        return a+b+c+d;
    }

    }

public class area{
    public static void main(String[] args) {
        Shape t = new Triangle(3, 4, 5);
        Shape c = new Circle(7);
        Shape r = new Rectangle(12, 10, 012, 10);

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
       
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
    }
}
