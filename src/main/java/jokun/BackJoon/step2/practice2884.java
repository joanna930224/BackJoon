package jokun.BackJoon.step2;

import java.util.Scanner;

public class practice2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m;

        h = sc.nextInt();
        m = sc.nextInt();

        if(0 < h){
            if(m < 45) {
                System.out.print(h - 1);
                System.out.print(" ");
                System.out.print(m + 15);
            } else {
                System.out.print(h);
                System.out.print(" ");
                System.out.print(m - 45);
            }
        }else if (0 == h){
            if(m < 45){
                System.out.print(h + 23);
                System.out.print(" ");
                System.out.print(m + 15);
            } else {
                System.out.print(h);
                System.out.print(" ");
                System.out.print(m - 45);
            }
        }
    }
}