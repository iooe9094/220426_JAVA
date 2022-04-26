package Parent_Child01;

public class ParentPoint {
    int x, y;

    // 좌표 출력용 메소드
    public void showPoint() {
        System.out.println("x:" + this.x + ", y:" + this.y);
    }

    // 좌표 저장용 메소드
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
