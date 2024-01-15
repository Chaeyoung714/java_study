package class7.ex7;

public class MathArrayUtils {
//    sol1 -> 이렇게 만들면 객체 생성이 더 맞는 코드 아닐까?

// 정적메서드 간에 사용할 것임 -> static 변수
//    private static int totalSum = 0;
//    private static int totalCount = 0;
//    private static int minValue;
//    private static int maxValue;
//    private MathArrayUtils() {
//    }
//
//    public static int sum(int[] array) {
//        for (int i : array) {
//            totalCount ++;
//            totalSum += i;
//        }
//        return totalSum;
//    }
//    public static double average(int[] array) {
//        int average = totalSum / totalCount;
//        return average;
//    }
//    public static int min(int[] array) {
//        minValue = array[0];
//        for (int i : array){
//            if (i < minValue) { minValue = i; }
//        }
//        return minValue;
//    }
//    public static int max(int[] array) {
//        maxValue = array[0];
//        for (int i : array) {
//            if (i > maxValue) { maxValue = i; }
//        }
//        return maxValue;
//    }

    private MathArrayUtils(){} //인스턴스 생성을 막는다.

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
    public static double average(int[] values) {
        return (double) sum(values) / values.length; //total로 sum의 값 활용
    }
    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
