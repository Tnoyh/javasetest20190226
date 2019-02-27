package com.neuedu.www.homework;

public class NarcissisticNumber {

    //水仙花数
    public static void main(String[] args) {

        for(int i=100;i<=999;i++){

            int j=(i%100)%10;//取得个位数
            int k=(i/10)%10;//取得十位数
            int l=i/100;//取得百位数

            if(j*j*j+k*k*k+l*l*l==i){
                System.out.println("  "+i);
            }

        }

    }
}
