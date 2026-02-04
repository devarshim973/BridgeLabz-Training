package com.Day5LogicalQuestions;

 import java.util.List;

public class SquareNumber {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.stream()
                                  .filter(n -> n % 2 == 0)  // Step 1: Keep only even numbers
                                  .map(n -> n * n)          // Step 2: Square each number
                                  .reduce(0, Integer::sum); // Step 3: Sum all squares

        System.out.println(sumOfSquares);
    }
}
