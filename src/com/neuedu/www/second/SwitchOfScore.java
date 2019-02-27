package com.neuedu.www.second;

import java.util.Scanner;

public class SwitchOfScore {
    public static void main(String[] args) {

        System.out.println("请输入你的成绩：");
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();

        int i=score/10;


        switch (i){

            case 10:
            case 9:
                System.out.println("A");break;
            case 8:
                System.out.println("B");break;
            case 7:
                System.out.println("C");break;
            case 6:
                System.out.println("D");break;
            default:
                System.out.println("E");break;
        }
    }
}
