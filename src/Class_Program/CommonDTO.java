package Class_Program;

// DTO 기본형 : 멤버변수 + getter&setter
// DTO(Data Transfer Object) : DB에서 정보를 저장할 클래스
public class CommonDTO {

    String paginationInfo;
    Boolean deleteYn;
    String insertTime;
    String updateTime;
    String deleteTime;

    // 멤버변수 출력용 메소드로, 디버깅 목적으로 사용
    public void info() {
        System.out.println("페이징정보 : " + getPaginationInfo() +
                            ", 삭제여부 : " + getDeleteYn() +
                            ", 등록일 : " + getInsertTime() +
                            ", 수정일 : " + getUpdateTime() +
                            ", 삭제일 : " + getDeleteTime());
    }

    public String getPaginationInfo() {
        return paginationInfo;
    }

    public void setPaginationInfo(String paginationInfo) {
        this.paginationInfo = paginationInfo;
    }

    public Boolean getDeleteYn() {
        return deleteYn;
    }

    public void setDeleteYn(Boolean deleteYn) {
        this.deleteYn = deleteYn;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }
}
