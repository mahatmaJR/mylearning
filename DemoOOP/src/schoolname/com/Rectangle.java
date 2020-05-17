package schoolname.com;

public class Rectangle extends Shape {
    public double area(){
        Shape sh = new Shape();
        sh.setL(6.5);
        sh.setW(3.4);
        double a = sh.getL() * sh.getW();
        return a;
    }

    public double perimeter(){
        Shape sh = new Shape();
        sh.setL(4.5);
        sh.setW(9.1);
        double p = 2 * (sh.getL() + sh.getW());
        return p;
    }
}
