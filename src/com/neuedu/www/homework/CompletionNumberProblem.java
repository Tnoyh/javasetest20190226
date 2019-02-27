package com.neuedu.www.homework;

public class CompletionNumberProblem {

    //输入1000内的所有完数
    public static void main(String[] args) {
        int i,j;

        //j作为因数
        for(i=1;i<1000;i++){

            int k=0;
            for(j=1;j<i;j++){

                if(i%j==0){

                    k+=j;
                }
            }

            if(k==i){
                System.out.println(i);
            }
        }
    }
}
