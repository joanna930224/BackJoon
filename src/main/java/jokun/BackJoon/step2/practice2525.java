package jokun.BackJoon.step2;

import java.util.Scanner;

public class practice2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m, t;

        h = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        if(m + t < 60){
            System.out.print(h);
            System.out.print(" ");
            System.out.print(m + t);
        } else {
            int hour = h + ((m + t)/60);
            if(hour >= 24){
                System.out.print(hour - 24);
            }else{
                System.out.print(hour);
            }
            System.out.print(" ");
            System.out.print((m + t)%60);
        }
    }
}