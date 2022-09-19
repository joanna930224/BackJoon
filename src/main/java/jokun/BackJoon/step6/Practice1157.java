package jokun.BackJoon.step6;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.toLowerCase();
        int max = 0;
        char answer = ' ';

        int[] textList = new int[26];

        for (int i = 0; i < text.length(); i++) {
            textList[text.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(textList));

        for (int i = 0; i < textList.length; i++) {
            if(max<textList[i]) {
                max = textList[i];
                answer = (char)(65+i);
            }else if(max == textList[i]) {
                answer='?';
            }
        }

        System.out.println(answer);
    }
}