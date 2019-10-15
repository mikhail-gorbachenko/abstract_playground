package lyabdas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mine {

    public static void main(String[] args) throws InterruptedException {

       List<Double> list  = Arrays.asList(new Double(2), new Double(3), new Double(4.2), new Double(-1), new Double(-13), new Double(9.99));

        HashSet<Double> set = new HashSet<>(list);
        Stream<Double> stream = set.stream();

        TreeSet<Double> orderedSet = new TreeSet<>(set);


    }
}