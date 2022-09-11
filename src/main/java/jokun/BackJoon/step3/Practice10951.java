package jokun.BackJoon.step3;

import java.util.Scanner;

public class Practice10951 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()){
            int testCase1 = sc.nextInt();
            int testCase2 = sc.nextInt();

            sum = testCase1 + testCase2;
            System.out.println(sum);
        }
    }
}