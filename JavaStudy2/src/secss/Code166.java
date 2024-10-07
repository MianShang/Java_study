package secss;

abstract class Book {

    private int code;    // 책 코드
    private String title; // 책 제목

    Book( ){}

    Book(int code, String title) {
        this.code = code;
        this.title = title;
    }

    int getCode( ) {
        return code;
    }

    String getTitle( ) {
        return title;
    }

    abstract void printInfo( );
}

class ComputerBook extends Book {

    private int stock; // 재고 수

    ComputerBook( ){}

    ComputerBook(int code, String title, int stock) {
        super(code, title);
        this.stock = stock;
    }

    void printInfo( ) {
        System.out.println("Computer Book Info");
        System.out.println("------------------");
        System.out.println("code : " + getCode( ));
        System.out.println("title : " + getTitle( ));
        System.out.println("stock : " + this.stock);
    }
}

class EnglishBook extends Book {

    private int publishedYear; // 출판연도

    EnglishBook( ){}

    EnglishBook(int code, String title, int publishedYear) {
        super(code, title);
        this.publishedYear = publishedYear;
    }

    void printInfo( ) {
        System.out.println("English Book Info");
        System.out.println("------------------");
        System.out.println("code : " + getCode( ));
        System.out.println("title : " + getTitle( ));
        System.out.println("publishedYear : " + this.publishedYear);
    }
}


public class Code166 {

    public static void main(String[] args) {
        Book book[] = {new ComputerBook(1123, "Java", 15),
                new EnglishBook(2000, "Toefl", 2019),
                new EnglishBook(2001, "Toeic", 2018),
                new ComputerBook(1150, "Python", 17),
                new EnglishBook(2010, "Gre", 2018)};

        for (Book bk : book) {
            bk.printInfo( );
            System.out.println( );
        }
    }
}