package by.jrr.learn;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoOverloadConstructors {

    static int count = 0;
    int [] array = {1,2,3,4,5,6,7,8,9,10};

     TwoOverloadConstructors inrement() {
        count++;
        return this;
    }



    public static void main(String[] args) {
        var two = new TwoOverloadConstructors();
        two.inrement().inrement().inrement().inrement().inrement().inrement().inrement();
        System.out.println(TwoOverloadConstructors.count);
        for (int i = 0; i < two.array.length; i++) {
            System.out.print(two.array[i] + " ");
        }
        Arrays.sort(two.array);
        var collection = Arrays.stream(two.array).filter(it -> it >= 4).toArray();
        for (int x:collection
             ) {
            System.out.println(x);
        }
    }
}
