package jokun.BackJoon.step6;

import java.util.Scanner;

public class Practice1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        text = text.trim();
        String[] textPiece = text.split(" ");
        if(text.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(textPiece.length);
        }
    }
}