package Class_Program;

public class CategoryDTO {

    int idParent;
    String title;
    String icon;
    String description;

    public void info() {
        System.out.println("카테고리 부모 id : " + idParent +
                           ", 카테고리 제목 : " + title +
                           ", 카테고리 아이콘 : " + icon +
                           ", 카테고리 설명 : " + description);
    }

    public int getIdParent() {
        return idParent;
    }
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
