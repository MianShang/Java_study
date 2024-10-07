package Intf;

interface Things {
    void printInfo();
}

interface book extends Things{
    void printInfo();
}

class ChildrenBook implements book{
    private String Book;
    private String author;

    ChildrenBook(){}
    ChildrenBook(String book, String author){
        this.Book = book;
        this.author = author;
    }

    public void printInfo(){
        System.out.println("** Infomation for books **");
    }

    public void showTitle(){
        System.out.println("교 재 : "+Book);
        System.out.println("저 자 : "+author);
    }
}

public class Code169
{
    public static void main(String[] args) {
        ChildrenBook chb = new ChildrenBook("Java 마스터","송미영");

        chb.printInfo();
        chb.showTitle();
    }
}
