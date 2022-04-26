package Class_Program;

// db의 내용이 DTO 객체에 저장됨
public class BoardDTO {

    int idx; // 번호(PK)
    String title; // 제목
    String content; // 내용
    String writer; // 작성자
    int viewCnt; // 조회수
    Boolean noticeYn; // 공지 여부
    Boolean secretYn; // 비밀 여부
    Boolean changeYn; // 파일 변경 여부
    String filedxs; // 파일 언덱스 리스트

    public void info() {
        System.out.println("번호 : " + idx +
                           ", 제목 : " + title +
                           ", 내용 : " + content +
                           ", 작성자 : " + writer +
                           ", 조회수 : " + viewCnt +
                           ", 공지여부 : " + noticeYn +
                           ", 비밀여부 : " + secretYn +
                           ", 파일변경여부 : " + changeYn +
                           ", 파일 언덱스 리스트 " + filedxs);
    }

    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public int getViewCnt() {
        return viewCnt;
    }
    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }
    public Boolean getNoticeYn() {
        return noticeYn;
    }
    public void setNoticeYn(Boolean noticeYn) {
        this.noticeYn = noticeYn;
    }
    public Boolean getSecretYn() {
        return secretYn;
    }
    public void setSecretYn(Boolean secretYn) {
        this.secretYn = secretYn;
    }
    public Boolean getChangeYn() {
        return changeYn;
    }
    public void setChangeYn(Boolean changeYn) {
        this.changeYn = changeYn;
    }
    public String getFiledxs() {
        return filedxs;
    }
    public void setFiledxs(String filedxs) {
        this.filedxs = filedxs;
    }

    
    
}
