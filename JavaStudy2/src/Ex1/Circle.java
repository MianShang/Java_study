package Ex1;

public class Circle {
    static double PI = 3.141592;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area(){
       return this.radius * PI * this.radius;
    }

    double perimeter() {
        return this.radius * 2 * PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());

    }
}
