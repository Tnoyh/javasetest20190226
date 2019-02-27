package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerIncomeTax {
    public static void main(String[] args) {

        System.out.println("请输入你的工资：");

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = 1100;  //五险一金的费用为1100

        System.out.println("这是你实际到手的工资：");


        //免征额为：5000RMB
        if(i<=6100){
            System.out.println(i-j);
        }else if(i>6100&&i<=8000){
                System.out.println( i-j-(i-j-5000)*0.03 );
             }else if(i>8000&&i<=17000){
                     System.out.println( i-j-(i-j-5000)*0.1 );
                  }else if(i>17000&&i<=30000){
                          System.out.println( i-j-(i-j-5000)*0.2 );
                       }
        //我还没有减去 速算扣除数
    }
}
