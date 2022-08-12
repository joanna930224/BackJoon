package jokun.BackJoon.step2;

import java.util.Scanner;

public class practice9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testScore = sc.nextInt();

        if(90 <= testScore && testScore <= 100){
            System.out.println("A");
        }else if(80 <= testScore && testScore <= 89){
            System.out.println("B");
        }else if(70 <= testScore && testScore <= 79){
            System.out.println("C");
        }else if(60 <= testScore && testScore <= 69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
