package Interface;

// 최초 생성 후 public 뒤 interface 넣어주면 자동으로 인터페이스 파일이 된다.
// 인터페이스 : 메소드 목록 이름만 있는 것 (추상메소드, 상수만 가능하므로)
public interface BoardService {
    public abstract void registerBoard(String params);
    public abstract void registerBoard(String params, String files);
    public abstract void getBoardDetail(Long idx);
    public abstract void deleteBoard(Long idx);
    public abstract void getBoardList(String params);
    public abstract void getAttachFileList(Long boardIdx);
    public abstract void getAttachDetail(Long idx);
}
