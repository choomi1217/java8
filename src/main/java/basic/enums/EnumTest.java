package basic.enums;

public class EnumTest {
    public static void main(String[] args) {
        String color = "RED";
        if (color.equals(Color.RED)) {
            System.out.println("equals RED");
        }
        if(color == Color.RED.toString()) {
            System.out.println("== RED");
        }
    }
    public static enum Color {
        RED, GREEN, BLUE;
    }
}
