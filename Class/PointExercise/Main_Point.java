package Class.PointExercise;

public class Main_Point {

    public static void main(String[] args) {
        Point point1 = new Point(3,4);

        point1.distanceFromOrigin();
        point1.CurrentPoint();
        point1.addXY(3,4);
        point1.distanceFromOrigin();
        System.out.println("=================================");

        Point point2 = new Point(10,16);

        point2.distanceFromOrigin();
        point2.CurrentPoint();
        point2.addXY(3, 16);
        System.out.println("=================================");

        Point point3 = new Point(12,2);

        point3.CurrentPoint();
        point3.distanceFromOrigin();
        System.out.println("=================================");

        TwoPoint twoPoint = new TwoPoint(point1,point2);

        twoPoint.currentPoints();
        twoPoint.PointsDistance();
        twoPoint.slope();
        System.out.println("=================================");

        Triangle triangle = new Triangle(point1, point2, point3);

        triangle.pointsLocations();
        triangle.longestEdge();
        triangle.triangleArea();
    }
}
