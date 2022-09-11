package jokun.BackJoon.step6;

import java.util.Scanner;

public class Practice11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int num = sc.nextInt();
        String inputNum = sc.next();

        for (int i = 0; i < num; i++) {
            int splitNum = inputNum.charAt(i) - '0';
            sum += splitNum;
        }
        System.out.println(sum);
    }
}