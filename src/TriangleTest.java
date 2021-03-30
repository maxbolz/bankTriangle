public class TriangleTest {

    public static void main(String[] args) {

        rightTriangle t1 = new rightTriangle(4.0);
        rightTriangle t2 = new rightTriangle(6.0);
        equilateralTriangle t3 = new equilateralTriangle(4.0);
        equilateralTriangle t4 = new equilateralTriangle(6.0);

        Triangle [] triangles = {t1,t2,t3,t4};

        for(Triangle t : triangles) {
            System.out.println(t);
            System.out.println("Area = " + t.getArea());
            System.out.println("Perimeter = " + t.getPerimeter());
            System.out.println("Ratio = " + t.getRatio());
        }
    }
}
