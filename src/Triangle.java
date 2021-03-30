public abstract class Triangle
{
    private double side;

    public Triangle(double s)
    {
        side = s;
    }

    public double getSide() {
        return side;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String toString();

    public double getRatio()
    {
        return getArea()/getPerimeter();
    }
}