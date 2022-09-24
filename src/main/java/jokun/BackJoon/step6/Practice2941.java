package jokun.BackJoon.step6;

import java.util.Scanner;

public class Practice2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String croatia = sc.next();
        sc.close();

        croatia = croatia.replaceAll("c=", "1");
        croatia = croatia.replaceAll("c-", "1");
        croatia = croatia.replaceAll("dz=", "1");
        croatia = croatia.replaceAll("d-", "1");
        croatia = croatia.replaceAll("lj", "1");
        croatia = croatia.replaceAll("nj", "1");
        croatia = croatia.replaceAll("s=", "1");
        croatia = croatia.replaceAll("z=", "1");

        System.out.println(croatia.length());
    }
}
