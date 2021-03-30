public class rightTriangle extends Triangle {


    public rightTriangle(double s) {
        super(s);
    }

    public double getPerimeter() {
        return (2 + Math.sqrt(2.0)) * getSide();
    }

    public double getArea() {
        return getSide() * getSide() / 2;
    }

    public String toString() {
        return "A right triangle with legs length " + getSide();
    }
}
