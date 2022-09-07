package jokun.BackJoon.step5;

public class Practice4673 {
    public static void main(String[] args) {
        boolean check[] = new boolean[10000];

        for (int i = 1; i <= check.length; i++) {
            //10000까지의 숫자를 모두 계산해야하니까 이렇게 식을 세움
            int result = i + i / 10000 + ( i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + i % 10;
            if(result <= 10000){
                check[result - 1] = true;
            }
        }

        for (int i = 0; i < check.length; i++) {
            if(!check[i]){
                System.out.println(i + 1);
            }
        }
    }




}

