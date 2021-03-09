package Class.PointExercise;

public class Triangle {

    int x1;
    int y1;

    int x2;
    int y2;

    int x3;
    int y3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.x1 = p1.x;
        this.y1 = p1.y;
        this.x2 = p2.x;
        this.y2 = p2.y;
        this.x3 = p3.x;
        this.y3 = p3.y;
    }

    public void triangleArea() {
        double a = x1*y2 + x2*y3 + x3*y1;
        double b = x2*y1 + x3*y2 + x1*y3;
        double area = Math.abs(a-b) / 2;

        System.out.printf("Area of the triangle: %.1f", area);
    }

    public void longestEdge() {
        double a = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double b = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
        double c = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
        double longestEdge = Math.max(a, Math.max(b,c));

        System.out.printf("Longest edge of triangle: %.1f\n", longestEdge);
    }

    public void pointsLocations() {
        System.out.println("Point1: (" + x1 + "," + y1 + ")");
        System.out.println("Point2: (" + x2 + "," + y2 + ")");
        System.out.println("Point3: (" + x3 + "," + y3 + ")");
    }
}
