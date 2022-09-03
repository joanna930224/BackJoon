package jokun.BackJoon.step4;

import java.util.*;

public class Practice3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numList = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            numList.add(num % 42);
        }
        System.out.println(numList.size());
    }
}
