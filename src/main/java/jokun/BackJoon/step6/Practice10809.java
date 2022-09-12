package jokun.BackJoon.step6;

import java.util.*;

public class Practice10809 {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        Map<Character, Integer> alphabetMap = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(97+i);
            alphabetMap.put(alphabet[i],-1);
        }

        for (int i = 0; i < text.length(); i++) {
            if(alphabetMap.get(text.charAt(i)) == -1){
                //key가 같으면 덮어쓰기 되는 것을 활용!
                alphabetMap.put(text.charAt(i), i);
            }
        }
        for (Character key : alphabetMap.keySet()
             ) { Integer value = alphabetMap.get(key);
            System.out.print(value + " ");
        }
    }
}
