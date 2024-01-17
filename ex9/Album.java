package class9.ex9;

public class Album extends Item{

    String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
//        super.name = name;
//        super.price = price;
        this.artist = artist;
    }

    @Override
    public void print() {
//        System.out.println("이름:" + name + ", 가격:" + price);
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
