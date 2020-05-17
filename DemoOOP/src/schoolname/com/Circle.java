package schoolname.com;

public class Circle extends Shape {

    double area(){
        Shape sh = new Shape();
        sh.setR(12.867);
        double a = (3.145 * sh.getR() * sh.getR());
        return a;
    }

    double perimeter(){
        Shape sh = new Shape();
        sh.setR(11.777);
        double p = (3.145 * (2 * sh.getR()));
        return p;
    }


}
