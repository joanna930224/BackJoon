package jokun.BackJoon.step4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice8958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int cnt = 0;
            int fullCnt = 0;

            List<Character> oxList = new ArrayList<>();
            String ox = sc.next();

            for (int j = 0; j < ox.length(); j++) {
                oxList.add(ox.charAt(j));

                if (oxList.get(j) == 'O'){
                    cnt = cnt + 1;
                }else {
                    cnt = 0;
                }
                fullCnt = fullCnt + cnt;
            }
        System.out.println(fullCnt);
        }
    }
}
