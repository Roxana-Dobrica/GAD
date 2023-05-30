package Collections;

import java.util.ArrayList;
import java.util.List;


public class Leaders {
    public static List<Integer> findLeaders(List<Integer> numbers) {
        List<Integer> leaders = new ArrayList<>();
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > maxSoFar) {
                leaders.add(numbers.get(i));
                maxSoFar = numbers.get(i);
            }
        }

        reverseList(leaders);

        return leaders;
    }

    private static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 25, 8, 12, 2, 20);
        List<Integer> leaders = findLeaders(numbers);

        System.out.println("Leaders: " + leaders);
    }
}
