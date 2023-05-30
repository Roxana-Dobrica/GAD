package Collections;

import java.util.ArrayList;
import java.util.List;


public class BellTriangle {
    
public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(prevRow.get(i - 1));

            for (int j = 1; j <= i; j++) {
                int sum = currRow.get(j - 1) + prevRow.get(j - 1);
                currRow.add(sum);
            }

            triangle.add(currRow);
        }

        return triangle;
    }

    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generateTriangle(numRows);

        printTriangle(triangle);
    }
}