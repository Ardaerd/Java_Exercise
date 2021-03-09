package Class.PointExercise;

public class TwoPoint {

     int x1;
     int y1;
     int x2;
     int y2;

    public TwoPoint(Point p1, Point p2) {
        this.x1 = p1.x;
        this.y1 = p1.y;
        this.x2 = p2.x;
        this.y2 = p2.y;
    }

    public void PointsDistance() {
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.printf("Distance between two points: %.1f\n", distance);
    }

    public void slope() {
        double m = (double) (y2-y1)/(x2-x1);

        System.out.printf("Slope: %.1f\n", m);
    }

    public void currentPoints() {
        System.out.println("Point1: (" + x1 + "," + y1 + ")");
        System.out.println("Point2: (" + x2 + "," + y2 + ")");
    }
}
