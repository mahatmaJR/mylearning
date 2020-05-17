package schoolname.com;

public class Square extends Shape {

    public double area(){
        Shape sh = new Shape();
        sh.setL(5.5);
        double a = (sh.getL() * sh.getL());
        return a;
    }

    public double perimeter(){
        Shape sh = new Shape();
        sh.setL(7.5);
        double p = 2 * (sh.getL() + sh.getL());
        return p;
    }
}
