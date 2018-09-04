package com.zzw.diguiTest;


/**
 * 斐波那契列数:
 *      有一对小兔子,在第三个月后开始每个生一对兔子,问:假如兔子不死,第20个月能生多少对
 *      第一个月: 1
 *      第二个月: 1
 *      第三个月: 2
 *      第四个月: 3
 *      第五个月: 5
 *      第六个与: 8
 *      第七个月: 13
 *
 * */
public class FeiBoNaQie {
    public static void main(String[] args) {
        int tuSum = fei(20);
        System.out.println(tuSum);
    }

    public static int fei(int tu){
        if(tu == 1){
            return 1;
        }else if(tu == 2){
            return 1;
        }else{
            int result = fei(tu -1) + fei(tu -2);
            return result;
        }
    }
}
