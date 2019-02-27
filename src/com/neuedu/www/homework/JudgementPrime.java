package com.neuedu.www.homework;

//判断101到200之间到素数并输出
public class JudgementPrime {
    public static void main(String[] args) {


        int num=0;//使用number进行计数
        for(int i= 101 ;i<200;i++){

            boolean flag = true;//假设最开始都是素数


            for(int j=2;j<i;j++){

               if(i%j==0){ //只要有能除尽的自然就不是素数
                     flag=false;
                     break;
               }
            }

            if (flag==true){
                num++;

                System.out.print("   "+i);

                if(num%10==0){  //每隔十个进行换行
                    System.out.println();
                }


            }
        }


    }
}
