package Parent_Child01;

public class TestPoint {
    public static void main(String[] args) {
        ColorPointDTO color = new ColorPointDTO();

        color.set(1, 2);
        color.setColor("Red");

        color.showPoint();

        BlackPointDTO black = new BlackPointDTO();

        black.set(2, 1);
        black.setBlackYn(true);

        black.showPoint();
    }
}
