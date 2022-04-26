package Class_Program;

public class TestDTO {
    public static void main(String[] args) {

        CommonDTO test1 = new CommonDTO();

        test1.setPaginationInfo("페이징정보");
        test1.setDeleteYn(true);
        test1.setInsertTime("등록일");
        test1.setUpdateTime("수정일");
        test1.setDeleteTime("삭제일");

        System.out.println(" [ CommonDTO ] ");
        test1.info();

        CommentDTO test2 = new CommentDTO();

        test2.setIdx(1);
        test2.setBoardIdx(1);
        test2.setContent("게시판내용");
        test2.setWriter("글쓴이");

        System.out.println(" [ CommendDTO ] ");
        test2.info();

        BoardDTO test3 = new BoardDTO();

        test3.setIdx(1);
        test3.setTitle("title");
        test3.setContent("content");
        test3.setWriter("writer");
        test3.setViewCnt(1);
        test3.setNoticeYn(true);
        test3.setSecretYn(true);
        test3.setFiledxs("filedxs");

        System.out.println(" [ BoardDTO ] ");
        test3.info();

        AttachDTO test4 = new AttachDTO();

        test4.setIdx(1);
        test4.setBoardIdx(1);
        test4.setOriginalName("originalName");
        test4.setSaveName("saveName");
        test4.setSize(1);

        System.out.println(" [ AttachDTO ] ");
        test4.info();

        CategoryDTO test5 = new CategoryDTO();

        test5.setIdParent(1);
        test5.setTitle("title");
        test5.setIcon("icon");
        test5.setDescription("description");

        System.out.println(" [ CategoryDTO ] ");
        test5.info();

        ProductDTO test6 = new ProductDTO();

        test6.setName("name");
        test6.setPrice(1);
        test6.setDescription("description");
        test6.setImageURL("imageURL");
        test6.setColor("color");
        test6.setSize(1);
        test6.setDiscount(1);
        test6.setCategoryId(1);
        test6.setCreateTimestamp("createTimestamp");
        test6.setUpdateTimestamp("updateTimestamp");
        test6.setDiscountPrice(1);

        System.out.println(" [ ProudctDTO ] ");
        test6.info();
    }
}
