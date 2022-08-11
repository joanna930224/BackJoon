package jokun.BackJoon.step1;

import java.util.Scanner;

public class practice3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - input[i] + " ");
        }
    }
}
