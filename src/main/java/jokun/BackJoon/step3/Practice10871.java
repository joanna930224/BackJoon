package jokun.BackJoon.step3;

import java.io.IOException;
import java.util.Scanner;

public class Practice10871 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int progression = sc.nextInt();
        int num = sc.nextInt();
        sc.nextLine();

        int[] progressionArr = new int[progression];
        for (int i = 0; i < progression; i++) {
            int progressionNum = sc.nextInt();
            progressionArr[i] = progressionNum;
        }
        for (int i = 0; i < progression; i++) {
            if(progressionArr[i] < num){
                System.out.print(progressionArr[i] + " ");
            }
        }
    }
}