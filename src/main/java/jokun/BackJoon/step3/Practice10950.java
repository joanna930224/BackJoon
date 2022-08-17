package jokun.BackJoon.step3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Practice10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> testCaseList = new LinkedList<>();

        int testCaseNum = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= testCaseNum; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            testCaseList.add(a + b);
        }
        for (int j : testCaseList) {
            System.out.println(j);
        }
    }
}
