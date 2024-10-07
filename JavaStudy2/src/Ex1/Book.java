package Ex1;

public class Book {
    private String title;
    private int price;

    Book(){}

    Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    void printBook(){
        System.out.println("title: " + title);
        System.out.println("price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programing", 25000);
        //book1.price = 27000;//에러가 뜰 수 밖에 없다
        book1.printBook();
    }
}
