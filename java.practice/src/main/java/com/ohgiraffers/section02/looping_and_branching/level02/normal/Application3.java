package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("수");
            } else System.out.print("박");
        }
        in.close();
    }
}




