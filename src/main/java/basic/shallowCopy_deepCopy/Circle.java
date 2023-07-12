package basic.shallowCopy_deepCopy;

public class Circle implements Cloneable{
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Circle shallowCopy() {
        return clone();
    }

    public Circle deepCopy() {
        return new Circle(new Point(point.getX(), point.getY()), radius);
    }
}
