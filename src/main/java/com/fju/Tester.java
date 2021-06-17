package com.fju;

import java.util.Scanner;

public class Tester {

    private static Object M1;
    private static Object M2;
    private static Object M3;
    private static Object M4;
    private static Object M5;

    public static void main(String[] args, String movie, String time) {

        System.out.println("請輸入0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("電影名稱       時間" + "\t" + M1 + "\t" + M2 + "\t" + M3 + "\t" + M4 + "\t" +M5);

        System.out.println("輸入想看的電影代碼");

        System.out.println("please enter your age");
        int money = Integer.parseInt(scanner.next());

        System.out.println("電影:"+ movie + "開場時間:" + time + "價錢:" +money);

    }
}
