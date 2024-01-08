package class6.ex6.a;

public class Item {
//    //default로 해야 ShoppingCart에서 쓰는데...> 다른방법
//    String name;
//    int price;
//    int quantity;
//
//    public Item(String name, int price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }

    //정답
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //상품명, 가격*개수를 다른 클래스에서 필요로 함 -> public메서드로 따로 호출해야지, 데이터를 public나 default로 하면 안됨
    public String getName() {
        return name;
    }
    //외부에서 필요로 하는 데이터를 정확하게 내부에서 반환
    public int getTotalPrice() {
        return price * quantity;
    }
}
