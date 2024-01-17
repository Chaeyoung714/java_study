package class9.ex9;

public class Movie extends Item{

    String director;
    String actor;
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
//        super.name = name;
//        super.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
//        System.out.println("이름:" + name + ", 가격:" + price);
        super.print();
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
