package com.neuedu.www.homework;

public class MonkeysEatPeach {

    //猴子吃桃问题
    public static void main(String[] args) {

        int sum=0;
        int n=1;
        for(int i=1;i<10;i++){

            n=(n+1)*2;

        }
        sum+=n;
        System.out.println("第一天一共摘了"+sum);
    }
}
