package jokun.BackJoon.step7;

import java.util.Scanner;

public class practice2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Kilogram = sc.nextInt();
        int pack = 0;

        if (3 <= Kilogram && Kilogram <= 5000) {
            while(true){
                if(Kilogram%5==0)
                {
                    System.out.println(Kilogram/5 + pack);
                    break;
                }else if(Kilogram<=0)
                {
                    System.out.println(-1);
                    break;
                }
                Kilogram-=3;
                pack++;
            }
        }else{

            System.out.println(-1);
        }
    }
}



