package Class.PointExercise;

public class Triangle {

    int x1;
    int y1;

    int x2;
    int y2;

    int x3;
    int y3;

    double a;
    double b;
    double c;

    public Triangle(Point p1, Point p2, Point p3) {
        this.x1 = p1.x;
        this.y1 = p1.y;
        this.x2 = p2.x;
        this.y2 = p2.y;
        this.x3 = p3.x;
        this.y3 = p3.y;

         a = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
         b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
         c = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
    }

    public boolean isTriangle() {
        if (x1 == x2 && x2 == x3)
            return false;
        else return y1 != y2 || y2 != y3;
    }

    public void triangleArea() {
        if (isTriangle()) {
            double a = x1*y2 + x2*y3 + x3*y1;
            double b = x2*y1 + x3*y2 + x1*y3;
            double area = Math.abs(a-b) / 2;

            System.out.printf("Area of the triangle: %.1f", area);
        } else {
            System.out.println("This is not a triangle.");
        }
    }

    public void longestEdge() {
        if (isTriangle()) {
            double a = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
            double b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
            double c = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
            double longestEdge = Math.max(a, Math.max(b,c));

            System.out.printf("Longest edge of triangle: %.1f\n", longestEdge);
        } else
            System.out.println("This is not a triangle.");
    }

    public void pointsLocations() {
        System.out.println("Point1: (" + x1 + "," + y1 + ")");
        System.out.println("Point2: (" + x2 + "," + y2 + ")");
        System.out.println("Point3: (" + x3 + "," + y3 + ")");

        System.out.printf("Edge1: %.1f\n", a);
        System.out.printf("Edge2: %.1f\n", b);
        System.out.printf("Edge3: %.1f\n", c);
    }
}
