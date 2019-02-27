package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerIfTest {

//    输入一个数值，判断此数是否能够被3整除但不能被7整除。
    public static void main(String[] args) {

        int te;
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入一个数值：");
        te=scan.nextInt();

        if(te%3==0 && te%7 != 0){
            System.out.println("此数能被3整除但不能被7整除");
        }else{
            System.out.println("此数不符合条件");
        }
    }
}
