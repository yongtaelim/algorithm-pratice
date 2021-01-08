package com.example.algorithm.practice124;

import java.util.LinkedList;
import java.util.Queue;

public class practice {

    public static void main(String[] args) {
        System.out.println(알고리즘_124_나라_FAIL(15));
        System.out.println(알고리즘_124_나라_SUCCESS(15));
    }

    private static String 알고리즘_124_나라_SUCCESS(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static String 알고리즘_124_나라_FAIL(int n) {
        StringBuilder resultBuilder = new StringBuilder();
        Queue<Integer> results = new LinkedList<>();
        int modulo;

        while (n > 2) {
            modulo = n % 3;
            results.add(modulo);
            n /= 3;
        }

        modulo = n % 3;
        results.add(modulo);

        int next = 0;
        while(!results.isEmpty()) {
            Integer poll = results.poll();
            poll += next;
            if(poll == 0 && !results.isEmpty()) {
                poll = 4;
                next = -1;
            } else if (poll == 0 && results.isEmpty()) {
                poll = null;
            } else {
                next = 0;
            }

            if(poll != null)
                resultBuilder.append(poll);
        }

        return resultBuilder.reverse().toString();
    }
}
