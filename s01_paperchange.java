package com.wenwen.swordtooffer.sword_greed;

/**
 * Created by Administrator on 2018/3/28.
 * 1. 纸币找零问题
 *    假设1元、2元、5元、10元、20元、50元、100元的纸币，张数不限制，现在要用来支付K元，至少要多少张纸币？
 */

public class s01_paperchange {

    public static void main(String[] args){
        for (int i=10;i<20;i++){
            greedyGiveMoney(i);
        }
    }

    public static void greedyGiveMoney(int money) {
        System.out.println("需要找零: " + money);
        int[] moneyLevel = {1,5,10,20,50,100};
        for (int i = moneyLevel.length - 1; i >= 0; i--) {
            int num = money/ moneyLevel[i];
            int mod = money % moneyLevel[i];
            money = mod;
            if (num > 0) {
                System.out.println("需要" + num + "张" + moneyLevel[i] + "块的");
            }
        }
    }

}
