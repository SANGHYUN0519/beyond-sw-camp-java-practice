package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    }
//    public static String rockPaperScissors(){
//        int randomNumber = (int)(Math.random()*3)+1;
//        return switch (randomNumber) {
//            case 1 -> "주먹";
//            case 2 -> "가위";
//            case 3 -> "보자기";
//        };
//    }
//    public static String tossCoin(){
//        int randomNumber = (int)(Math.random()*2)+1;
//        return switch (randomNumber){
//            case 1 -> "앞면";
//            case 2 -> "뒷면";
//            default -> "";
//        };
//    }
//}