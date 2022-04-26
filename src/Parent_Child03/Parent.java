package Parent_Child03;

public class Parent {
    int x, y;

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw() {
        System.out.println("x=" + x + " y=" + y);
    }
}
