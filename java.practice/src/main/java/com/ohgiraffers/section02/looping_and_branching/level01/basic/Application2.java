package com.ohgiraffers.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하시오 : ");
        int n = in.nextInt();
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println("1부터 5까지의 합 :" + sum);
    }
}
