package Class.PointExercise;

public class Point {
     int x;
     int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addXY(int x, int y) {
        this.x += x;
        this.y += y;

        System.out.println("Current Point: (" + this.x + "," + this.y +")");
    }

    public void distanceFromOrigin() {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.printf("Distance from the origin: %.1f\n", distance);
    }

    public void CurrentPoint() {
        System.out.println("Point: (" + x + "," + y + ")");
    }

}
