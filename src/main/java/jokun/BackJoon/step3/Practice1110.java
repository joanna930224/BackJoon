package jokun.BackJoon.step3;

import java.util.Scanner;

public class Practice1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int numCopy = num;

        int cycle = 0;

        while (true){

            num = ((num % 10)*10) + (((num / 10) + (num % 10)) % 10);
            cycle++;

            if(num == numCopy){
                break;
            }
        }
        System.out.println(cycle);
    }
}

