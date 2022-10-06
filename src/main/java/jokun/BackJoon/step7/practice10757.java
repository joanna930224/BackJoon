package jokun.BackJoon.step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class practice10757 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        String str1 = stringTokenizer.nextToken();
        String str2 = stringTokenizer.nextToken();

        BigDecimal A = new BigDecimal(str1);
        BigDecimal B = new BigDecimal(str2);

        bw.append(A.add(B).toString());

        bw.flush();
    }
}

