package jokun.BackJoon.step8;

import java.util.Scanner;

public class practice1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] dec = new boolean[N + 1];

        dec[0] = dec[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (dec[i] == true) {
                continue;
            }
            for (int j = i + i; j <= N; j = j + i) {
                dec[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (dec[i] == false) {
                System.out.println(i);
            }
        }

    }
}

