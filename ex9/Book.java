package class9.ex9;

public class Book extends Item{

    String author;
    String isbn;
    public Book(String name, int price, String author, String isbn) {
        super(name, price);

//        super.name = name; //super키 주의! 부모공간에 저장되는 애잖아
//        super.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
//        System.out.println("이름:" + name + ", 가격:" + price);
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
