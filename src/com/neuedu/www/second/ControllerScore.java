package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerScore {

    public static void main(String[] args) {

        System.out.println("请输入成绩：");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        if(i >= 90 && i <= 100){
            System.out.println("你的成绩为优秀，请继续保持，少撩妹。");
        } else if  (i >= 80 && i <= 90){
               System.out.println("你的成绩为良好，很骄傲吗？");
          }else if(i >= 70 && i <= 80){
                   System.out.println("你的成绩为一般");
            }else if(i >= 60 && i <= 70){
                        System.out.println("你的成绩为一般般");
               }else if(i < 60){
                            System.out.println("你成绩不及格，回家吧孩子，学着心累。");
                  }

    }

}
