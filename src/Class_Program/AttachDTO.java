package Class_Program;

// DB에 데이터를 가져와서 클래스 객체에 저장
// "첨부파일" DTO 클래스
public class AttachDTO {

    int idx; // 파일번호
    int boardIdx; // 게시글번호
    String originalName; // 원본파일명
    String saveName; // 저장파일명
    int size; // 파일크기

    public void info() {
        System.out.println("파일번호 : " + idx +
                           ", 게시글번호 : " + boardIdx +
                           ", 원본파일명 : " + originalName +
                           ", 저장파일명 : " + saveName +
                           ", 파일크기 : " + size);
    }

    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public int getBoardIdx() {
        return boardIdx;
    }
    public void setBoardIdx(int boardIdx) {
        this.boardIdx = boardIdx;
    }
    public String getOriginalName() {
        return originalName;
    }
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }
    public String getSaveName() {
        return saveName;
    }
    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    
    
}
