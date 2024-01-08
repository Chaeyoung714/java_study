package class6.ex6.a;

public class MaxCounter {
    private int count; //0 초기화
    private int max; //애매하지만 일단 데이터는 다 잠그랬다.
    
    public MaxCounter(int max) { //다른 패키지에서도 사용 가능해야 하니까!
        this.max = max;
    }
    
    public void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }

//        아래와 같이 return 문을 활용해 검증로직과 실행로직을 아예 분리하는 것도 좋다.
//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//            return;
//        }
//
//        count++;
    }
    public int getCount() {
        return count;
    }
    
}
