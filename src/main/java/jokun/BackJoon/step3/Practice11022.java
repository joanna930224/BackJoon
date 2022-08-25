package jokun.BackJoon.step3;

import java.io.*;
import java.util.StringTokenizer;

public class Practice11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= t; i++) { // 1부터 시작하도록 한다 -> Case 값도 같이 표기하기 위해서
            st = new StringTokenizer(br.readLine() , " ");
            // 입력받은 문자열을 delim으로 분리
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            bw.write("Case #" + i + ": "+ a + " + " + b + " = " + sum + "\n");
        }
        br.close();

        //버퍼 비우기
        bw.flush();

        //버퍼 닫기
        bw.close();
    }
}