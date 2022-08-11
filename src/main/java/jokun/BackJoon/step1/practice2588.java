package jokun.BackJoon.step1;

import java.util.Scanner;


public class practice2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] numArr = new int[3];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = num2 % 10;
            num2 = num2 / 10;
        }

        int[] result = new int[3];
        for (int i = 0; i < numArr.length; i++) {
            result[i] = num1 * numArr[i];
            System.out.println(result[i]);
        }

        System.out.println(result[0] + (result[1]*10) + (result[2]*100));
    }
}
