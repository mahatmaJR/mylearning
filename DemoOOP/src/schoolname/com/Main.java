package schoolname.com;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("The area of the Circle: " + c.area());
        System.out.println("The Perimeter of the Circle: " + c.perimeter());

        Triangle t = new Triangle();
        System.out.println("The area of the Triangle: " + t.area());
        System.out.println("The Perimeter of the Triangle: " + t.perimeter());

        Rectangle r = new Rectangle();
        System.out.println("The area of the Rectangle: " + r.area());
        System.out.println("The Perimeter of the Rectangle: " + r.perimeter());

        Square sq = new Square();
        System.out.println("The area of the Square: " + sq.area());
        System.out.println("The perimeter of the Square: " + sq.perimeter());
    }
}
