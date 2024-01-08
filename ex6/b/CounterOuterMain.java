package class6.ex6.b;

import class6.ex6.a.MaxCounter;

public class CounterOuterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);


    }
}
