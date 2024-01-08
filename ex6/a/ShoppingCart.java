package class6.ex6.a;

public class ShoppingCart {
//    private int itemCount; //배열의 Index역할도 되네.
//    private Item[] items = new Item[10]; //배열은 개수 정해있는 거... 알지
//
//    public void addItem(Item item) {
//        if (itemCount >= 10) {
//            System.out.println("장바구니가 가득 찼습니다.");
//            return;
//        }
//
//        items[itemCount] = item; //이 코드 먼저 (인덱스 역할 수행 위해)
//        itemCount++;
//
//        System.out.println("상품명:" + item.name + ", 합계:" + item.price * item.quantity);
//
//    }
//
//    public void displayItems() {
//        int totalPrice = 0;
//        for (Item item : items) {
////            System.out.println(item.name); //이건 정상작동...
//            totalPrice += item.price * item.quantity;
//        }
//        System.out.println("전체 가격 합: " + totalPrice);
//    }

    //정답
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
        // items[itemCount++] = item; 으로 축약 가능
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        //상품 리스트 출력
        for (int i = 0; i < itemCount; i++) {
            //중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //배열은 이미 10개가 만들어짐 -> 배열을 다 돌도록 하면, 장바구니가 덜 찼으면 Item은 null을 가리켜서 nullPointerException이 발생!!

            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice()); //주의!!!!!!!! 이 로직이 캡슐화에 더 적합하겠지??
        }

        //전체가격합 구하기 : 가격합을 구하는 로직은 따로 떼어서 보면 더 편하겠다.
        System.out.println("전체 가격 합: " + calculateTotalPrice());


    }

    //내부로직에 해당 -> private 접근제어자 사용
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}
