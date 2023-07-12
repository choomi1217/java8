package basic.shallowCopy_deepCopy;

public class DeepCopy {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 2.0);
        Circle copy = circle.deepCopy();
        circle.setRadius(3.0);
        circle.getPoint().setX(2);
        circle.getPoint().setY(2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPoint().getX()+", "+circle.getPoint().getY());
        System.out.println(copy.getRadius());
        System.out.println(copy.getPoint().getX()+", "+copy.getPoint().getY());
    }
}
