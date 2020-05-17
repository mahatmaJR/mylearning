package schoolname.com;

public class Triangle extends Shape {
    public double area(){
        Shape sh = new Shape();
        sh.setB(2.5);
        sh.setH(3.4);
        double a = 0.5 * (sh.getB() * sh.getH());
        return a;
    }

    public double perimeter(){
        Shape sh = new Shape();
        sh.setB(11.2);
        sh.setH(10.4);
        double p = 2 * (sh.getB() + sh.getH());
        return p;
    }
}
