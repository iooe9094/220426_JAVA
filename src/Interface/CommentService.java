package Interface;

public interface CommentService {
    public abstract void registerComment(String params);
    public abstract void deleteComment(long idx);
    public abstract void getCommentList(String params);
}
