package jokun.BackJoon.step4;

import java.util.Scanner;

public class Practice4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();

        for(int i=0; i<C; i++){
            int N[]= new int[in.nextInt()];
            int sum=0;

            for(int j=0; j<N.length; j++){
                int grade = in.nextInt();
                N[j] = grade;
                sum += grade;
            }
            double avr=sum/N.length;
            double count = 0;

            for(int k=0; k<N.length; k++){
                if(N[k] > avr){
                    count++;
                }
            }
            System.out.printf("%.3f",count/N.length*100);
            System.out.println("%");
        }
    }
}
