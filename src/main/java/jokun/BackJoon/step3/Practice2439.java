package jokun.BackJoon.step3;

import java.io.IOException;
import java.util.Scanner;

public class Practice2439 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        int cnt = 0;
        int cnt2 = starNum;

        for (int i = 0; i < starNum; i++) {
            cnt++;
            cnt2--;
            for (int j = 0; j < cnt2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cnt; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}