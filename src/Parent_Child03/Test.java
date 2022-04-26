package Parent_Child03;

public class Test {
    public static void main(String[] args) {

        Line line = new Line();
        line.setXY(1, 1);
        line.draw();
        System.out.println("==========");

        Rect rect = new Rect();
        rect.setXY(2, 2);
        rect.draw();
        System.out.println("==========");

        Circle circle = new Circle();
        circle.setXY(3, 3);
        circle.draw();
        System.out.println("==========");
    }
}
