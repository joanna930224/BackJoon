package jokun.BackJoon.step7;

import java.io.IOException;
import java.util.Scanner;

public class practice2775 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[][] answer = new int[size][2];

        for(int i = 0; i < size; i++) {
            answer[i][0] = input.nextInt(); // k층
            answer[i][1] = input.nextInt(); // n호
        }

        int[][] apartment = new int[15][15];
        for(int i = 1; i < apartment.length; i++) {
            apartment[0][i] = i;
        }

    }
}

