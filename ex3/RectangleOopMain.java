package class3.ex3;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 8;//입력되는 값은 변할 수 있으니 클라이언트 자리에서 정의하는 것이 더 나을듯.

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);

    }
}
