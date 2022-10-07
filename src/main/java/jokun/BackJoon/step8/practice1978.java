package jokun.BackJoon.step8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice1978 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            list.add(input);
        }

        int sum = n;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 1) {
                sum--;
            }
            for (int j = 2; j < list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    sum--;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
