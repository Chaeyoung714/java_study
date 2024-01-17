package class9.ex9;

public class Item {

    protected String name; //접근제어자 주의!
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        //super로 자식클래스에서 저장하는 것도 좋지만, 부모영역의 속성은 여기서 처리하는 게 캡슐화에 더 유리할 것 같다.
    }

    protected int getPrice() {
        return price;
    }
    protected void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }
}
