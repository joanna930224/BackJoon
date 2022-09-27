package jokun.BackJoon.step7;

import java.util.Scanner;

public class practice2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(hive(num));
    }

    public static int hive(int num){
        int cnt = 1;
        int tmp = 0;

        if(num == 1){
            return 1;
        }
        while (num > tmp){
            cnt++;
            tmp = 1 + 3 * cnt * (cnt - 1);
        }
        return cnt;
    }
}
