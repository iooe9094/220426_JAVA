package Interface;

public class CommentServiceImpl implements CommentService {

    @Override
    public void deleteComment(long idx) {
        System.out.println("첨언 삭제");
    }

    @Override
    public void getCommentList(String params) {
        System.out.println("첨언 목록 가져오기");
    }

    @Override
    public void registerComment(String params) {
        System.out.println("첨언 등록");
    }
    
}
