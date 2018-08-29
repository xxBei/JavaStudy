package com.zzw.Interage;

public class InterageDemo {
    /**
     * Integer:
     *      String --- int
     *          方式一:
     *              int intValue()
     *          方式二:
     *              static int parseInt(String s)
     *
     *      int --- String
     *          方式一:
     *              + ""
     *          方式二:
     *              String toString();
     *          方式三:
     *              Integer.toString();
     *
     * 构造方法:
     *      Integer(int i)
     *      Integer(String s)
     * */

    public static void main(String[] args) {
        //String 转为 int
        //String s = "20";
        //方法一: int intValue()
        /*Integer i = new Integer(s);
        i.intValue();
        System.out.println(i);*/
        //方法二:static int parseInt(String s)
        /*int a = Integer.parseInt(s);
        System.out.println(a);*/

        //int 转为 String
        int i = 10;
        //方法一:
        /*String str = i + "";
        System.out.println(str);*/
        //方法二:String toString();
        /*Integer integer = new Integer(i);
        String str = integer.toString();
        System.out.println(str);*/
        //方法三:Integer.toString();
        String str = Integer.toString(i);
        System.out.println(str);



    }

}
