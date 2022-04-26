package Class_Program;

public class ProductDTO {

    String name;
    int price;
    String description;
    String imageURL;
    String color;
    int size;
    int discount;
    int categoryId;
    String createTimestamp;
    String updateTimestamp;
    int discountPrice;
    
    public void info() {
        System.out.println("상품 이름 : " + name +
                           ", 상품 가격 : " + price +
                           ", 상품 설명 : " + description +
                           ", 상품 이미지 경로 : " + imageURL +
                           ", 상품 색상 : " + color +
                           ", 상품 크기 : " + size +
                           ", 상품 할인율 : " + discount +
                           ", 상품 카데고리 id : " + categoryId +
                           ", 상품 등록 일자 : " + createTimestamp +
                           ", 상품 수정 일자 : " + updateTimestamp +
                           ", 상품 할인 가격 : " + discountPrice);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCreateTimestamp() {
        return createTimestamp;
    }
    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }
    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
    public int getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    
    
}
