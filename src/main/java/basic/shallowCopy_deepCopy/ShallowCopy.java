package basic.shallowCopy_deepCopy;

public class ShallowCopy {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 1), 2.0);
        Circle copy = circle.shallowCopy();
        System.out.println(circle == copy);
        System.out.println(circle.toString());
        System.out.println(copy.toString());
//        basic.shallowCopy_deepCopy.Circle@232204a1
//        basic.shallowCopy_deepCopy.Circle@4aa298b7
    }

}

