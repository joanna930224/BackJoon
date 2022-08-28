package jokun.BackJoon.step3;

import java.util.Scanner;

public class Practice10952 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true){
            int testCase1 = sc.nextInt();
            int testCase2 = sc.nextInt();
            if(testCase1 == 0 && testCase2 == 0){
                break;
            }
            sum = testCase1 + testCase2;
            System.out.println(sum);
        }
    }
}
