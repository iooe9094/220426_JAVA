package Class_Program;

// DTO 기본형 : 멤버변수 + getter&setter
// DTO(Data Transfer Object) : DB에서 정보를 저장할 클래스
public class CommentDTO {

    int idx;
    int boardIdx;
    String content;
    String writer;

    // 멤버변수 출력용 메소드로, 디버깅 목적으로 사용
    public void info() {
        System.out.println("글번호 : " + getIdx() +
                            ", 게시판번호 : " + getBoardIdx() +
                            ", 게시판내용 : " + getContent() +
                            ", 글쓴이 : " + getWriter());
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
}
