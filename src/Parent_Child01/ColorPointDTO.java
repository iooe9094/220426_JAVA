package Parent_Child01;

public class ColorPointDTO extends ParentPoint {
    private String color;

    @Override
    public void showPoint() {
        System.out.println("컬러색상 : " + color);
        super.showPoint();
    }

    // 컬러 저장용 메소드
    public void setColor(String color) {
        this.color = color;
    }

    
}
