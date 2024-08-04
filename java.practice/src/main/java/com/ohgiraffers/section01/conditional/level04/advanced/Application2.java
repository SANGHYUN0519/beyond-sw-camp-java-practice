package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("월 급여 입력 : ");
        double monsalary = in.nextDouble();

        System.out.println("매출액 입력: ");
        double salesAmount = in.nextDouble();



        double bounsRate;
        if (salesAmount >= 50000000) {
            bounsRate = 0.05;
        } else if (salesAmount >= 30000000) {
            bounsRate = 0.3;
        } else if (salesAmount >= 10000000) {
            bounsRate = 0.1;
        } else {bounsRate = 0.0;}
        {

            double bonusAmount = salesAmount * bounsRate;
            double totalsalary = monsalary + bonusAmount;
        }



    }

}










//double bonusAmount = salesAmount * bonusRate;
//
//// Calculate the total salary
//double totalSalary = monthlySalary + bonusAmount;
//
//// Print the results
//        System.out.println("======================");
//        System.out.printf("매출액 : %d\n", salesAmount);
//        System.out.printf("보너스율 : %.0f%%\n", bonusRate * 100);
//        System.out.printf("월 급여 : %d\n", monthlySalary);
//        System.out.printf("보너스 금액 : %.0f\n", bonusAmount);
//        System.out.println("======================");
//        System.out.printf("총 급여 : %.0f\n", totalSalary);
//
//// Close the scanner
//        scanner.close();
//    }
//            }
