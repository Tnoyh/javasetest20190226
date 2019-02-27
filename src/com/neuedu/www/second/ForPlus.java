package com.neuedu.www.second;

public class ForPlus {
    public static void main(String[] args) {

        /*
        //从1加到100的值为
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("从1加到100的值为："+sum);*/


        //从1到100的偶数之和
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
               sum+=i;
            }
        }
        System.out.println("从1到100偶数之和为："+sum);
    }
}
