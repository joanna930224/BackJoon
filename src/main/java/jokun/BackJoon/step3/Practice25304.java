package jokun.BackJoon.step3;

import java.util.Scanner;

public class Practice25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int priceSum = sc.nextInt();
        int productNum = sc.nextInt();

        int price = 0;
        int num = 0;
        int cal_price = 0;

        for (int i = 0; i < productNum; i++) {
            price = sc.nextInt();
            num = sc.nextInt();
            cal_price += price * num;

        }
        if(cal_price != priceSum){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
