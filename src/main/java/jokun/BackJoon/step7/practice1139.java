package jokun.BackJoon.step7;

import java.util.Scanner;

public class practice1139 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k=0, a=1;
        while(true){
            k+=a++;
            if(n<=k){
                k-=a-1;
                System.out.println((a%2==0)?(a-n+k)+"/"+(n-k):(n-k)+"/"+(a-n+k));
                break;
            }
        }
        sc.close();
    }
}
