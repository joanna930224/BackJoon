package jokun.BackJoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Practice15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        //버퍼 비우기
        bw.flush();

        //버퍼 닫기기
        bw.close();
    }
}
