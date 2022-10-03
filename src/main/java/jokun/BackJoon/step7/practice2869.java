package jokun.BackJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int dayCnt = (height - night) / (day - night);
        if((height - night) % (day - night) != 0 ){
            dayCnt++;
        }
        System.out.println(dayCnt);
    }
}
