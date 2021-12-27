package br.com.guilhermealvessilve.dynamic.programming.howsum;

import java.util.ArrayList;
import java.util.List;

public class HowSumRecursive {

    public static void main(String[] args) {
        System.out.println("howSum(7, [2, 3]): " + howSum(7L, List.of(2L, 3L))); // [3, 2, 2]
        System.out.println("howSum(7, [5, 3, 4, 7]): " + howSum(7L, List.of(5L, 3L, 4L, 7L))); // [4, 3]
        System.out.println("howSum(7, [2, 4]): " + howSum(7L, List.of(2L, 4L))); // null
        System.out.println("howSum(8, [2, 3, 5]): " + howSum(8L, List.of(2L, 3L, 5L))); // [2, 2, 2, 2]
    }

    public static List<Long> howSum(long targetSum, List<Long> numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (var number : numbers) {
            long remainder = targetSum - number;
            var list = howSum(remainder, numbers);
            if (list != null) {
                list.add(number);
                return list;
            }
        }

        return null;
    }
}
