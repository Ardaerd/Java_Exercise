package Inheritance_and_Interface.Shape;

public class Square extends Shape{
    private int x1;
    private int y1;

    private int x2;
    private int y2;

    private int x3;
    private int y3;

    private int x4;
    private int y4;

    public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double getPerimeter() {
        if (checkSquare()) {
            return 4 * (Math.sqrt(Math.pow(getX2()-getX1(),2) + Math.pow(getY2()-getY1(),2)));
        } else {
            return 0.0;
        }
    }

    public double getArea() {
        if (checkSquare()) {
            return Math.pow(Math.sqrt(Math.pow(getX2()-getX1(),2) + Math.pow(getY2()-getY1(),2)),2);
        } else {
            return 0.0;
        }
    }

    public boolean checkSquare() {
        double edge1 = Math.sqrt(Math.pow(getX2()-getX1(),2) + Math.pow(getY2()-getY1(),2));
        double edge2 = Math.sqrt(Math.pow(getX3()-getX2(),2) + Math.pow(getY3()-getY2(),2));
        double edge3 = Math.sqrt(Math.pow(getX4()-getX3(),2) + Math.pow(getY4()-getY3(),2));
        double edge4 = Math.sqrt(Math.pow(getX1()-getX4(),2) + Math.pow(getY1()-getY4(),2));

        if (edge1 == edge2 && edge2 == edge3 && edge3 == edge4) {
            System.out.println("It is a square.");
            return true;
        } else  {
            System.out.println("It is not a square");
            return false;
        }
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }
}
