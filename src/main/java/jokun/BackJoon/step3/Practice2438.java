package jokun.BackJoon.step3;

import java.io.*;
import java.util.Scanner;

public class Practice2438 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < starNum; i++) {
            cnt++;
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}