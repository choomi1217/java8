package basic.shallowCopy_deepCopy;

public class DeepCopy {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 2.0);
        Circle copy = circle.deepCopy();
        System.out.println(circle == copy);
    }
}
