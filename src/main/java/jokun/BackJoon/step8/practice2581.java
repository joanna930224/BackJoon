package jokun.BackJoon.step8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2581 {
    public static void foundSosu(int m, int n) {
        int sum = 0;
        int min = 0;
        int check = 0;
        for (int i = m; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                sum += i;
                check++;
                if(check==1){
                    min = i;
                }
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        foundSosu(m, n);
    }
}
