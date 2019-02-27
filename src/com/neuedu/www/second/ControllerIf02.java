package com.neuedu.www.second;


import java.util.Scanner;

public class ControllerIf02 {


    public static void main(String[] args) {

//        1.输入
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年份");
        year = scan.nextInt();


//        2：判断  3.结果
//            四年一闰，百年不闰，四百年一闰


        if(year%4 == 0 && year%100 != 0 || year % 400 == 0){

            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}
