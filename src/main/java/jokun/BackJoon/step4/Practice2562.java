package jokun.BackJoon.step4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }
        System.out.println(Collections.max(numList));
        System.out.println(numList.indexOf(Collections.max(numList)) + 1);
    }
}
