package by.jrr.learn;

import java.util.Comparator;
import java.util.Set;

public class App {

    public static void main(String[] args)  {
        Set<Integer> riskLevels = Set.of(2,3,4,1);
        System.out.println(riskLevels.stream().min(Comparator.naturalOrder()).get());

    }
}
