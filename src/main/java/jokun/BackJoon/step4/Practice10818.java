package jokun.BackJoon.step4;

import java.util.Scanner;

public class Practice10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] numArr = new int[num];
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }

        int min = numArr[0];
        int max = numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if(min > numArr[i]){
                min = numArr[i];
            }
            if(max < numArr[i]){
                max = numArr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
