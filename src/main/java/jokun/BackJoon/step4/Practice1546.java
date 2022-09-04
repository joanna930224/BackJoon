package jokun.BackJoon.step4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjectNum = sc.nextInt();
        sc.nextLine();

        List<Integer> subjectScore = new ArrayList<>();
        int score = 0;

        for (int i = 0; i < subjectNum; i++) {
            score = sc.nextInt();
            subjectScore.add(score);
        }
        int max = Collections.max(subjectScore);

        int sum = 0;
        for (Integer integer : subjectScore) {
            sum += integer;
        }

        System.out.println(sum * 100.0  / subjectNum / max);
    }
}
