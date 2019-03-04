package com.neuedu.www.homework;


import java.util.Scanner;

//输入年月日计算出具体的天数
public class JudgementDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：只需要输入数字就好");
        int year = scanner.nextInt();

        System.out.println("请输入月份：只需要输入数字就好");
        int month = scanner.nextInt();

        System.out.println("请输入号数：只需要输入数字就好");
        int day = scanner.nextInt();

        int days=0;

        for(int i = 1;i<month;i++){
            switch (i){
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                break;


                case 2://2月份判断闰年的情况

                if(year%4==0&&year%100!=0||year%400==0){

                    days += 29;
                }else
                    days+=28;
                break;


                default:
                    days+=31;
                    break;
            }
        }

        days+=day;//加上最后的号数
        System.out.println(year+"年"+month+"月"+day+"日是"+year+"年的第"+days+"天。");

    }
}
