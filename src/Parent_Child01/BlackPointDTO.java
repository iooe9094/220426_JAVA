package Parent_Child01;

public class BlackPointDTO extends ParentPoint {
    private boolean blackYn;

    @Override
    public void showPoint() {
        System.out.println("흑백여부 : " + blackYn);
        super.showPoint();
    }

    public void setBlackYn(boolean blackYn) {
        this.blackYn = blackYn;
    }


}
