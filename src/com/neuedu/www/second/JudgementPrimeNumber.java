package com.neuedu.www.second;

import java.util.Scanner;

public class JudgementPrimeNumber {
    public static void main(String[] args) {
        System.out.println("请随便输入一个数：");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        boolean flag = false;

        for(int i= 2 ;i<num/2;i++){

            if(num%i==0){
                flag=true;
            }
        }
        String str = flag?"不是质数":"是质数";
        System.out.println("你输入的这个数"+str);

    }
}
